package com.mudzingwa.Product.Exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiHandlingException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamps;

    public ApiHandlingException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timestamps) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.timestamps = timestamps;
    }
}
