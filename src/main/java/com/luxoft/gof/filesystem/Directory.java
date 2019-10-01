package com.luxoft.gof.filesystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by msokolov on 5/6/2016.
 */
public class Directory extends FileSystemItem {
    private List<FileSystemItem> directoryContent;

    public Directory(String name, FileSystemItem... directoryContent) {
        super(name);
        this.directoryContent = Arrays.asList(directoryContent);
    }

    public Directory(String name) {
        super(name);
        this.directoryContent = Collections.emptyList();
    }

    @Override
    public int size() {
        return directoryContent.stream().mapToInt(FileSystemItem::size).sum();
    }
}
