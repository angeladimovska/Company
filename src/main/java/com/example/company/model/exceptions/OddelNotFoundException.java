package com.example.company.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class OddelNotFoundException extends RuntimeException{

    public OddelNotFoundException(Integer id) {
        super(String.format("Department with id %d was not found",id));
    }
}
