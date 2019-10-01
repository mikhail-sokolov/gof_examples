package com.luxoft.gof.visitor;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by msokolov on 6/25/2016.
 */
public class Test {
    @org.junit.Test
    public void testSize() throws Exception {
        FileSystemItem item = new Directory("/",
                new Directory("home",
                        new File("1", 1),
                        new File("2", 2)
                ),
                new Directory("usr",
                        new Directory("temp", new File("aaa.bak", 1000)),
                        new File("1", 1),
                        new File("2", 2)
                )
        );

        item.accept(new LS());
    }
}
