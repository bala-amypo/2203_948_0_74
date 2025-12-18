package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.util.*;

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