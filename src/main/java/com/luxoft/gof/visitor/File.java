package com.luxoft.gof.visitor;

/**
 * Created by msokolov on 5/6/2016.
 */
public class File implements FileSystemItem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
