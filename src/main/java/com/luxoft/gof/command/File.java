package com.luxoft.gof.command;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class File {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
