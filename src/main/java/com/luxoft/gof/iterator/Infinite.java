package com.luxoft.gof.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created by msokolov on 04.12.2015.
 */
public class Infinite {
    private static class InfiniteIterator implements Iterator<Double> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Double next() {
            return Math.random();
        }
    }

    private static class FilteredList<T> {
        private List<T> list;
        FilteredList(List<T> list) {
            this.list = list;
        }

        public List<T> filter(Predicate<T> p) {
            List<T> result = new ArrayList<>();
            for (T e: list) {
                if (p.test(e)) {
                    result.add(e);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        /*Iterable<Double> iterable = InfiniteIterator::new;
        for (Double d: iterable) {
            System.out.println(d);
        }*/
        /*new FilteredList<>(Arrays.asList(1, 2, 3, 4, 5))
                    .filter(n -> (n % 2) == 0)
                    .forEach(System.out::println);*/
        System.out.println(new Random().nextInt(4) + 1);
    }


}
