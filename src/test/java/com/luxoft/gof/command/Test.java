package com.luxoft.gof.command;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class Test {
    @org.junit.Test
    public void test() throws Exception {
        FileSystem fs = new FileSystem(new File("aaa"));
        Holder result = new Holder();
        fs.schedule(file -> result.value = file.name());
        assertThat(result.value, is("aaa"));
    }

    public static class Holder {
        public String value;
    }
}
