package com.luxoft.gof.decorator;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class EngineOption extends Decorator {
    public EngineOption(Configuration configuration) {
        super(configuration);
    }

    @Override
    public String engine() {
        return super.engine() + " Boosted";
    }
}
