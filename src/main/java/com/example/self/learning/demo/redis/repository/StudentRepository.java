package com.example.self.learning.demo.redis.repository;

import com.example.self.learning.demo.redis.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {}
