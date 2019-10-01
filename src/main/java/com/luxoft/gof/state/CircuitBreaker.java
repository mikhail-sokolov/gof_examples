package com.luxoft.gof.state;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

/**
 * Created by msokolov on 01.03.2016.
 */
public class CircuitBreaker {
    private CircuitBreakerState currentState;

    public CircuitBreaker(ExecutorService executorService) {
        currentState = new ClosedState(executorService);
    }

    public <T> T execute(Supplier<T> cmd) throws ExecutionError {
        return currentState.execute(cmd, this::setState);
    }

    public void setState(CircuitBreakerState circuitBreakerState) {
        this.currentState = circuitBreakerState;
    }
}
