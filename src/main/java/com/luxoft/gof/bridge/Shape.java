package com.luxoft.gof.bridge;

/**
 * Created by teacher109 on 8/22/2017.
 */
public class Shape {
    private Implementation implementation;

    public Shape(Implementation implementation) {
        this.implementation = implementation;
    }

    public void draw() {
        implementation.draw();
    }

    public void setImpl(Implementation impl) {
        this.implementation = impl;
    }
}
