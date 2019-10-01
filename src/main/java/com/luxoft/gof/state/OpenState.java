package com.luxoft.gof.state;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by msokolov on 01.03.2016.
 */
public class OpenState implements CircuitBreakerState {
    private ExecutorService executorService;

    public OpenState(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override
    public <T> T execute(Supplier<T> cmd, Consumer<CircuitBreakerState> changeState) throws ExecutionError {
        int seed = new Random().nextInt(10);
        if (seed > 7) {
            changeState.accept(new HalfOpenState(executorService));
        }
        throw new ExecutionError();
    }
}
