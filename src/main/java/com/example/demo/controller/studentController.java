package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;
import java.util.List;

@RestController
public class studentController
{
    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll()
    {
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student)
    {
        return service.addStudent(student);
    }

}
