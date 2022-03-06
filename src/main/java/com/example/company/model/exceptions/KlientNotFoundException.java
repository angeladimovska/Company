package com.example.company.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class KlientNotFoundException extends RuntimeException {

    public KlientNotFoundException(Integer id) {
        super(String.format("Client with id %d was not found",id));
    }
}
