package com.mudzingwa.Product.Exception;

public class GlobalExceptionHandler  extends RuntimeException{
    public GlobalExceptionHandler(String message) {
        super(message);
    }
    public GlobalExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }
}
