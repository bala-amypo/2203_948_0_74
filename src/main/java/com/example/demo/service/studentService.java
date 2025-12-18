package com.example.demo.service;

import com.example.demo.entity.studentEntity;
import java.util.*;

interface studentService
{
    List<studentEntity> getAll();

    studentEntity addStudent(studentEntity student);
}