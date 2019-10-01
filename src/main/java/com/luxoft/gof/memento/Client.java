package com.luxoft.gof.memento;

/**
 * Created by msokolov on 12/1/2015.
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println(person);
        Person.Memento personSnapshot = person.creteSnapshot();
        person.setName("Jane");
        System.out.println(person);
        person.restore(personSnapshot);
        System.out.println(person);
    }
}
