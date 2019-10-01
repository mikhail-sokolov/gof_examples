package com.luxoft.gof.visitor;

/**
 * Created by msokolov on 5/6/2016.
 */
public interface FileSystemItem {
    String getName();
    int size();
    void accept(Visitor v);
}
