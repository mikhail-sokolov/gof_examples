package com.luxoft.gof.adapter;

import java.util.*;

/**
 * Created by teacher109 on 7/27/2017.
 */
public class EnumerationToIterator<T> implements Iterator<T>, Iterable<T> {
    private Enumeration<T> enumeration;

    public EnumerationToIterator(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

    public static void main(String[] args) {
        Vector<String> patterns = new Vector<>(Arrays.asList("Adapter", "Builder", "Facade"));
        for (String pattern: new EnumerationToIterator<>(patterns.elements())) {
            System.out.println(pattern);
        }

    }
}
