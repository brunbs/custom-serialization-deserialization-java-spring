package com.seralization.example.controller;

import com.seralization.example.request.StudentRequest;
import com.seralization.example.service.StudentService;
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
    ResponseEntity<String> createStudent(@RequestBody StudentRequest studentRequest) {

        String studentJson = studentService.createStudent(studentRequest);

        return ResponseEntity.ok().body(studentJson);
    }

}
