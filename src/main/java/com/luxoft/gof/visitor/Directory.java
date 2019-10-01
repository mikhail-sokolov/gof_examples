package com.luxoft.gof.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by msokolov on 5/6/2016.
 */
public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> directoryContent;

    public Directory(String name, FileSystemItem... directoryContent) {
        this.name = name;
        this.directoryContent = Arrays.asList(directoryContent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int size() {
        return directoryContent.stream().mapToInt(FileSystemItem::size).sum();
    }

    public void add(Directory directory) {
        directoryContent.add(directory);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        directoryContent.forEach(i -> i.accept(v));
    }
}
