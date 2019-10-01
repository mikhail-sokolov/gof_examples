package com.luxoft.gof.decorator;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class ColorOption extends Decorator {
    private final String newColor;

    public ColorOption(Configuration configuration, String newColor) {
        super(configuration);
        this.newColor = newColor;
    }

    @Override
    public String color() {
        return newColor;
    }
}
