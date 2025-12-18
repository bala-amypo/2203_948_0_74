package com.example.demo.service.impl;

import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;
import com.example.demo.repository.studentRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@service

public class studentServiceImpl implements studentService
{
    @Autowired
    studentRepo repo;

    List<studentEntity> getAll()
    {
        return repo.findAll();
    }

    public studentEntity addStudent(studentEntity student)
    {
        return repo.save(student);
    }
}
