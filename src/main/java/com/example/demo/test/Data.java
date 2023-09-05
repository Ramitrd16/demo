package com.example.demo.test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class Data {

    @GetMapping(path = "/get-data")
    public JsonNode returnData(){
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.createObjectNode().put("Name","Ramit").put("Age",24).put("Occupation","Software Engineer");
    }
}
