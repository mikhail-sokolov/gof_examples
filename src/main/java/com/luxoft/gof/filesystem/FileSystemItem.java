package com.luxoft.gof.filesystem;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by msokolov on 5/6/2016.
 */
public abstract class FileSystemItem {
    protected String name;
    protected Set<NameChangeListener> listeners;

    public FileSystemItem(String name) {
        this.name = name;
        this.listeners = new LinkedHashSet<>();
    }

    abstract int size();

    public String name() {
        return name;
    }

    public void rename(String name) {
        String prevName = this.name;
        this.name = name;
        listeners.forEach(listener -> listener.onNameChanged(prevName, name));
    }

    public void register(NameChangeListener nameChangeListener) {
        listeners.add(nameChangeListener);
    }

    @FunctionalInterface
    interface NameChangeListener {
        void onNameChanged(String prevName, String newName);
    }
}
