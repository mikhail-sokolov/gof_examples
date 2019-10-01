package com.luxoft.gof.factorymethod.filesystem;


/**
 * Created by Teacher1316 on 6/8/2018.
 */
public abstract class FileSystem {
    public enum Type {
        WIN,
        OTHER
    }

    public abstract File createFile(String name);
}
