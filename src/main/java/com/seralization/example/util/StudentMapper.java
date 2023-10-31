package com.seralization.example.util;

import com.seralization.example.request.StudentRequest;
import com.seralization.example.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {

    StudentResponse requestToResponse(StudentRequest studentRequest);

}
