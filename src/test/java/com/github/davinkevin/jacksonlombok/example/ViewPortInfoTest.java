package com.github.davinkevin.jacksonlombok.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xebia.jacksonlombok.JacksonLombokAnnotationIntrospector;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.StrictAssertions.assertThat;

/**
 * Jackson-Lombok-Example
 * Created by kdavin on 29/10/2015.
 */
public class ViewPortInfoTest {

    ObjectMapper objectMapper = new ObjectMapper().setAnnotationIntrospector(new JacksonLombokAnnotationIntrospector());

    @Test
    public void should_deserialize() throws IOException {
        /* GIVEN */ String viewportAsJson = "{\"ul\":[0.0,0.0],\"br\":[10.0,10.0],\"zoomLevel\":3}";

        /* WHEN  */ ViewPortInfo viewPortInfo = objectMapper.readValue(viewportAsJson, ViewPortInfo.class);
        System.out.println(viewPortInfo );

        /* THEN  */
        assertThat(viewPortInfo).isNotNull();
    }

    @Test
    public void should_deserialize_with_null_value() throws IOException {
        /* GIVEN */ String viewportAsJson = "{\"ul\":null,\"br\":null,\"zoomLevel\":3}";

        /* WHEN  */ ViewPortInfo viewPortInfo = objectMapper.readValue(viewportAsJson, ViewPortInfo.class);
        System.out.println(viewPortInfo );

        /* THEN  */
        assertThat(viewPortInfo).isNotNull();
    }

}