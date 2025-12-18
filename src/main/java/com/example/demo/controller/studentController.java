package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;
import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController
{
    @Autowired
    private studentService service;

    @GetMapping("/getAll")
    public List<studentEntity> getAll()
    {
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student)
    {
        return service.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public studentEntity getbyId(@PathVariable Long id)
    {
        return service.getbyId(id);
    }

}
