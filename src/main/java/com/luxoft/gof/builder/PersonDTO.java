package com.luxoft.gof.builder;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by msokolov on 12/26/2016.
 */
public class PersonDTO implements PersonInfoBuilder {
    private Map<String, String> attributes;
    private String lastname;
    private String name;

    public PersonDTO() {
        attributes = new HashMap<>();
    }

    @Override
    public void setEmail(String email) {
        attributes.put("email", email);
    }

    @Override
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public void setMiddleName(String middlename) {

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String asJson() {
        attributes.put("name", name + " " + lastname);
        return new Gson().toJson(attributes);
    }
}
