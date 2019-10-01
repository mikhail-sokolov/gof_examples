package com.luxoft.gof.visitor;

/**
 * Created by teacher109 on 7/28/2017.
 */
public interface Visitor {
    void visit(Directory dir);
    void visit(File file);
}
