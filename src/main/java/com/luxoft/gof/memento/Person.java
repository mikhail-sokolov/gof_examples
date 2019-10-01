package com.luxoft.gof.memento;

/**
 * Created by msokolov on 12/1/2015.
 */
public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Memento creteSnapshot() {
        Memento memento = new Memento();
        memento.name = this.name;
        memento.surname = this.surname;
        return memento;
    }

    public void restore(Memento personSnapshot) {
        this.name = personSnapshot.name;
        this.surname = personSnapshot.surname;
    }

    public static class Memento {
        private String name;
        private String surname;
    }
}
