package com.github.davinkevin.jacksonlombok.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

/**
 * Jackson-Lombok-Example
 * Created by kdavin on 29/10/2015.
 */
@Value
public class Name {
    @JsonProperty
    String locale;
    @JsonProperty
    String name;
    @JsonProperty
    boolean primary;
}