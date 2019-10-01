package com.luxoft.gof.bridge;

/**
 * Created by teacher109 on 8/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(new Circle());
        shape.draw();
        shape.setImpl(new Triangle());
        shape.draw();
    }
}
