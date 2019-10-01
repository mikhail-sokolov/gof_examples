package com.luxoft.gof.command;

import java.util.function.Consumer;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class FileSystem {
    private File file;

    public FileSystem(File file) {
        this.file = file;
    }

    void schedule(Consumer<File> job) {
        job.accept(file);
    }
}
