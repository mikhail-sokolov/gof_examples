package com.luxoft.gof.visitor;

/**
 * Created by teacher109 on 7/28/2017.
 */
public class MkDir implements Visitor {
    private String dir;
    private String name;

    public MkDir(String dir, String name) {
        this.dir = dir;
        this.name = name;
    }

    @Override
    public void visit(Directory dir) {
        if (dir.getName().equals(name)) {
            dir.add(new Directory(name));
        }
    }

    @Override
    public void visit(File file) {

    }
}
