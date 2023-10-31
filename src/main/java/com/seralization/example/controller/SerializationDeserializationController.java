package com.seralization.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.seralization.example.request.StudentRequest;
import com.seralization.example.response.StudentResponse;
import com.seralization.example.service.StudentService;
import com.seralization.example.util.UpperCaseSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerializationDeserializationController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    ResponseEntity<String> createStudent(@RequestBody StudentRequest studentRequest) throws JsonProcessingException {

        StudentResponse student = studentService.createStudent(studentRequest);

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new SimpleModule().addSerializer(new UpperCaseSerializer()));
        String json = mapper.writeValueAsString(student);

        return ResponseEntity.ok().body(json);
    }

}
