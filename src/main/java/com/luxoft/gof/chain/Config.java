package com.luxoft.gof.chain;


import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

/**
 * Created by teacher109 on 7/27/2017.
 */
public abstract class Config {
    public abstract Object getOrDefault(String key, Object defaultValue);

    public static Config create(Source... sources) {
        requireNonNull(sources);
        return new Config() {
            @Override
            public Object getOrDefault(String key, Object defaultValue) {
                for (Source source: sources) {
                    Object value = source.get(key);
                    if (nonNull(value)) {
                        return value;
                    }
                }

                return defaultValue;
            }
        };
    }
}
