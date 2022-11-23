package com.example.demo.controlles;

import com.example.demo.Entitys.Workers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Jakson {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void pojoToJsonString() throws JsonProcessingException {
        Workers workers = new Workers();
        workers.setFirstName("aLng");

        workers.setLastName("Lang");

        String json = objectMapper.writeValueAsString(workers);
        System.out.println(json);
        String expectedJson = "{\"name\":\"aLng\",\"Lastname\":\"Lang\"}";
        Assertions.assertEquals(json, expectedJson);

    }
}
