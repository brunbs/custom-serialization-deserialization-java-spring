package com.seralization.example.service.Impl;

import com.seralization.example.request.StudentRequest;
import com.seralization.example.response.StudentResponse;
import com.seralization.example.service.StudentService;
import com.seralization.example.util.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentResponse createStudent(StudentRequest studentRequest) {

        //some business logics

        return studentMapper.requestToResponse(studentRequest);
    }
}
