package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class studentController
{
    @exceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException ex)
    {
        Map<String,String> error = new hashMap<>();

        ex.getBindingResult().getFieldsError().forEach(err -> error.put(ex.getField(),ex.getDefaultMessage()));

        return new ResponseEntity<>(error,HttpStatus.BADREQUEST); 
    }
}