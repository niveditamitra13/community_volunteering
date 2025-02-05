package com.example.demo.repository;


import com.example.demo.entity.TaskSignUpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TaskSignUpRepository extends JpaRepository<TaskSignUpEntity, Long> {
}