package com.seralization.example.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seralization.example.util.ToUpperCaseConverter;
import lombok.Data;

@Data
public class StudentRequest {

    private Long registration;
    @JsonDeserialize(converter = ToUpperCaseConverter.class)
    private String name;
    @JsonDeserialize(converter = ToUpperCaseConverter.class)
    private String lastName;

}
