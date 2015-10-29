package com.github.davinkevin.jacksonlombok.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xebia.jacksonlombok.JacksonLombokAnnotationIntrospector;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Jackson-Lombok-Example
 * Created by kdavin on 29/10/2015.
 */
public class CreationTest {

    ObjectMapper mapper = new ObjectMapper().setAnnotationIntrospector(new JacksonLombokAnnotationIntrospector());

    @Test
    public void should_deserialize() throws IOException {
        /* GIVEN */
        String creationInJson = "[{\"locale\":\"someLocale\",\"name\":\"someName\",\"primary\":true},{\"locale\":\"someLocale2\",\"name\":\"someName2\",\"primary\":false}]";
        /* WHEN  */
        Creation creation = mapper.readValue(creationInJson, Creation.class);
        /* THEN  */
        System.out.println("creation: " + creation);
        assertThat(creation).isNotNull();
    }
}