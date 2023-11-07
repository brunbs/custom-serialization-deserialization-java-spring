package com.seralization.example.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.seralization.example.request.StudentRequest;
import com.seralization.example.service.StudentService;
import com.seralization.example.util.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String createStudent(StudentRequest studentRequest) {
        try {
            //some business logics

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(studentRequest);

            //send json to messaging (kafka)

            return json;
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
