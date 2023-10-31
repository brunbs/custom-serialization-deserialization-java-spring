package com.seralization.example.controller;

import com.seralization.example.request.StudentRequest;
import com.seralization.example.response.StudentResponse;
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
    ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest studentRequest) {
        return ResponseEntity.ok().body(studentService.createStudent(studentRequest));
    }

}
