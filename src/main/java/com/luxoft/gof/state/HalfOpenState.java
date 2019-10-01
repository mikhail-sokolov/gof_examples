package com.luxoft.gof.state;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by msokolov on 01.03.2016.
 */
public class HalfOpenState implements CircuitBreakerState {
    private ExecutorService executorService;

    public HalfOpenState(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override
    public <T> T execute(Supplier<T> cmd, Consumer<CircuitBreakerState> changeState) throws ExecutionError {
        try {
            T result = executorService.submit(cmd::get).get(2, TimeUnit.SECONDS);
            changeState.accept(new ClosedState(executorService));
            return result;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            changeState.accept(new OpenState(executorService));
            throw new ExecutionError(e);
        }
    }
}
