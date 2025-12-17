package com.example.demo.exception;

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.util.*;

@RestControllerAdvice
public class studentController
{
    @exceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException ex)
    {
        
    }
}