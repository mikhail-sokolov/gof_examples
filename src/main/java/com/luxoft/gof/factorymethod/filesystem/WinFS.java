package com.luxoft.gof.factorymethod.filesystem;


/**
 * Created by Teacher1316 on 6/8/2018.
 */
public class WinFS extends FileSystem {
    @Override
    public File createFile(String name) {
        return new File() {
            @Override
            public String name() {
                return name;
            }
        };
    }
}
