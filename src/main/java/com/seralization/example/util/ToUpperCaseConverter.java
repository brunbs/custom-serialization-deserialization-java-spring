package com.seralization.example.util;

import com.fasterxml.jackson.databind.util.StdConverter;

public class ToUpperCaseConverter extends StdConverter<String, String> {

    @Override
    public String convert(String value) {
        return value.toUpperCase();
    }

}