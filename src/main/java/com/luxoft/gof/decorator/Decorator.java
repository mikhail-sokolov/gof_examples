package com.luxoft.gof.decorator;

/**
 * Created by teacher109 on 7/27/2017.
 */
public abstract class Decorator implements Configuration {
    private Configuration configuration;

    public Decorator(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String color() {
        return configuration.color();
    }

    @Override
    public String audioSystem() {
        return configuration.audioSystem();
    }

    @Override
    public String engine() {
        return configuration.engine();
    }

    @Override
    public String wheelSize() {
        return configuration.wheelSize();
    }
}
