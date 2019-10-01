package com.luxoft.gof.builder;

/**
 * Created by msokolov on 12/26/2016.
 */
public interface PersonInfoBuilder {
    void setEmail(String email);
    void setLastName(String lastname);
    void setMiddleName(String middlename);
    void setName(String name);
}
