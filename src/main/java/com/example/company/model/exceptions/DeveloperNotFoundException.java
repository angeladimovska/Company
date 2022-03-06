package com.example.company.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DeveloperNotFoundException extends RuntimeException {

    public DeveloperNotFoundException(String embg) {
        super(String.format("Developer with id %s was not found",embg));
    }
}
