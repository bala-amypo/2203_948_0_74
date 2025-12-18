package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class globalExceptionHandler
{
    @exceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationErrors
    (MethodArgumentNotValidException ex)
    {
        Map<String,String> error = new hashMap<>();

        ex.getBindingResult().getFieldsErrors().forEach(err -> 
        error.put(err.getField(),err.getDefaultMessage())
        );

        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST); 
    }
}