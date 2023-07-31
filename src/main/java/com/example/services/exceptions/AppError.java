package com.example.services.exceptions;

import lombok.Data;

@Data
public class AppError {

    private String message;

    private int httpStatusCode;

    public AppError(int httpStatusCode, String message) {
        this.message = message;
        this.httpStatusCode = httpStatusCode;
    }
}