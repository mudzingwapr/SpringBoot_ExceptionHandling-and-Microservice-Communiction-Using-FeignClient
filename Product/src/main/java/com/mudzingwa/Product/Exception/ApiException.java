package com.mudzingwa.Product.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;
@ControllerAdvice
public class ApiException {
    @ExceptionHandler(value={GlobalExceptionHandler.class})
    public ResponseEntity<Object> exceptionHandling(GlobalExceptionHandler e){
HttpStatus httpStatus= HttpStatus.BAD_REQUEST;

       ApiHandlingException apiHandlingException= new ApiHandlingException(e.getMessage(),
                e, HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z")));
       return new ResponseEntity<>(apiHandlingException, HttpStatus.BAD_REQUEST);
    }
}
