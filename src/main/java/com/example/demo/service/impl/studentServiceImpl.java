package com.example.demo.service.impl;

import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;
import com.example.demo.repository.studentRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class studentServiceImpl implements studentService
{
    @Autowired
    private studentRepo repo;

    @Override
    public List<studentEntity> getAll()
    {
        return repo.findAll();
    }

    @Override
    public studentEntity addStudent(studentEntity student)
    {
        return repo.save(student);
    }

    public studentEntity getbyId(Long id)
    {
      return repo.findById(id).orElseThrow(() -> new StudentNotFoundException(errMsg:"Student ID not Found"));
    }

    public studentEntity updateById(Long id,studentEntity newstu)
    {
        studentEntity existing = getbyId(id);
        newstu.setId(existing.getId());
        repo.save(newstu);
    }

    public studentEntity deleteByID(Long id)
    {
        studentEntity data = getbyId(id);
    }

}
