package com.luxoft.gof.chain;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class Test {
    @org.junit.Test
    public void test() throws Exception {
        Config config = Config.create(Sources.source("1"), Sources.source("2"), Sources.source("3"));
        assertThat(config.getOrDefault("10", "default"), is("default"));
        assertThat(config.getOrDefault("1", "default"), is("1"));
        assertThat(config.getOrDefault("2", "default"), is("2"));
        assertThat(config.getOrDefault("3", "default"), is("3"));
    }
}
