package com.luxoft.gof.builder;

/**
 * Created by msokolov on 12/26/2016.
 */
public class Person {
    private final String name;
    private final String lastname;
    private final String middlename;
    private final String email;

    public Person(String name, String lastname, String middlename, String email) {
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.email = email;
    }

    public void construct(PersonInfoBuilder builder) {
        builder.setName(this.name);
        builder.setMiddleName(this.middlename);
        builder.setLastName(this.lastname);
        builder.setEmail(this.email);
    }


}
