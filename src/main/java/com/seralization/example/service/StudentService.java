package com.seralization.example.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.seralization.example.request.StudentRequest;
import com.seralization.example.response.StudentResponse;

public interface StudentService {

    String createStudent(StudentRequest studentRequest);

}
