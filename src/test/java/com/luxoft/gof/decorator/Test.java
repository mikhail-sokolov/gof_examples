package com.luxoft.gof.decorator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class Test {
    @org.junit.Test
    public void test() throws Exception {
        Configuration config = new EngineOption(new ColorOption(new Base(), "green"));
        assertThat(config.color(), is("green"));
        assertThat(config.engine(), is("Engine Boosted"));
    }
}
