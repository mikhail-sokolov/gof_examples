package com.luxoft.gof.builder;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by msokolov on 12/26/2016.
 */
public class Test {
    @org.junit.Test
    public void testBuilder() throws Exception {
        Person person = new Person("John", "Doe", "Ivanovich", "jdoe@domain.com");
        PersonDTO builder = new PersonDTO();
        person.construct(builder);
        assertThat(builder.asJson(), is("{\"name\":\"John Doe\",\"email\":\"jdoe@domain.com\"}"));
    }
}
