package com.example.demo.repository;

import org.springframework.data.jpa.repository;
import com.example.demo.entity.studentEntity;

public interface studentRepo extends JpaRepository<studentEntity,Long>
{

}