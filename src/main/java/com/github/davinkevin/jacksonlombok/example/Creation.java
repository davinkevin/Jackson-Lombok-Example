package com.github.davinkevin.jacksonlombok.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.List;

/**
 * Jackson-Lombok-Example
 * Created by kdavin on 29/10/2015.
 */
@Value
public class Creation {
    @JsonProperty
    List<Name> names;
}
