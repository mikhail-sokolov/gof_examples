package com.luxoft.gof.filesystem;

/**
 * Created by msokolov on 5/6/2016.
 */
public class File extends FileSystemItem {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

}
