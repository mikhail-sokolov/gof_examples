package com.luxoft.gof.decorator;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class Base implements Configuration {
    @Override
    public String color() {
        return "White";
    }

    @Override
    public String audioSystem() {
        return "No";
    }

    @Override
    public String engine() {
        return "Engine";
    }

    @Override
    public String wheelSize() {
        return "16";
    }
}
