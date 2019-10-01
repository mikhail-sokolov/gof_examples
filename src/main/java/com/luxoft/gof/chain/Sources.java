package com.luxoft.gof.chain;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class Sources {
    public static Source defaultSource(Object defaultValue) {
        return key -> defaultValue;
    }

    public static Source source(String value) {
        return key -> value.equals(key) ? value : null;
    }
}
