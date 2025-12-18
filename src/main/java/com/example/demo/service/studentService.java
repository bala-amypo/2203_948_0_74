package com.example.demo.service;

import com.example.demo.entity.studentEntity;
import java.util.*;

public interface studentService
{
    List<studentEntity> getAll();

    studentEntity addStudent(studentEntity student);
}