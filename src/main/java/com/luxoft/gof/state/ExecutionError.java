package com.luxoft.gof.state;

/**
 * Created by msokolov on 01.03.2016.
 */
public class ExecutionError extends Exception {
    public ExecutionError() {
        super();
    }

    public ExecutionError(Exception e) {
        super(e);
    }
}
