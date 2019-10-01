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
public class ClosedState implements CircuitBreakerState {
    private final ExecutorService executorService;
    private int errors;

    public ClosedState(ExecutorService executorService) {
        this.executorService = executorService;
        errors = 0;
    }

    @Override
    public <T> T execute(Supplier<T> cmd, Consumer<CircuitBreakerState> changeState) throws ExecutionError {
        try {
            T result = executorService.submit(cmd::get).get(2, TimeUnit.SECONDS);
            if (errors > 0) {
                errors--;
            }
            return result;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            errors++;
            throw new ExecutionError(e);
        } finally {
            if (errors > 10) {
                changeState.accept(new OpenState(executorService));
            }
        }
    }
}
