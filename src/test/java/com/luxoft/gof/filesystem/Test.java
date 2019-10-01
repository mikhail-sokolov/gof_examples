package com.luxoft.gof.filesystem;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by msokolov on 6/25/2016.
 */
public class Test {
    @org.junit.Test
    public void testSize() throws Exception {
        int overallSize = new Directory("/",
                new Directory("home",
                        new File("1", 1),
                        new File("2", 2)
                ),
                new Directory("usr",
                        new Directory("temp", new File("aaa.bak", 1000)),
                        new File("1", 1),
                        new File("2", 2)
                )
        ).size();

        assertThat(overallSize, is(1006));
    }

    @org.junit.Test
    public void testSize1() throws Exception {
        int overallSize = new Directory("/",
                new Directory("home")
        ).size();

        assertThat(overallSize, is(0));
    }

    @org.junit.Test
    public void testRename() throws Exception {
        String name = "name";
        String otherName = "newName";
        File file = new File(name, 20);
        file.register((prevName, newName) -> {
            assertThat(prevName, is(name));
            assertThat(newName, is(otherName));
        });
        file.rename(otherName);
    }


}
