package com.luxoft.gof.state;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by msokolov on 01.03.2016.
 */
public interface CircuitBreakerState {
    <T> T execute(Supplier<T> cmd, Consumer<CircuitBreakerState> changeState) throws ExecutionError;
}
