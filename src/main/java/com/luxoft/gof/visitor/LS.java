package com.luxoft.gof.visitor;

/**
 * Created by teacher109 on 7/28/2017.
 */
public class LS implements Visitor {

    @Override
    public void visit(Directory dir) {
        System.out.println(dir.getName());
    }

    @Override
    public void visit(File file) {
        System.out.println(file.getName());
    }
}
