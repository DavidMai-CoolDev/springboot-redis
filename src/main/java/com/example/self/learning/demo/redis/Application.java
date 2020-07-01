package com.example.self.learning.demo.redis;

import com.example.self.learning.demo.redis.entity.Student;
import com.example.self.learning.demo.redis.entity.User;
import com.example.self.learning.demo.redis.repository.StudentRepository;
import com.example.self.learning.demo.redis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/")
	public List<Student> getAlluser(){
		Student engStudent = new Student(
				"Eng2015001", "John Doe", Student.Gender.MALE, 1);
		Student medStudent = new Student(
				"Med2015001", "Gareth Houston", Student.Gender.MALE, 2);
		studentRepository.save(engStudent);
		studentRepository.save(medStudent);
		List<Student> students = new ArrayList<>();
		students = (List<Student>) studentRepository.findAll();
		studentRepository.findAll().forEach(students::add);
		System.out.println(students);
		return students;
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
//		userRepository.create();


	}

}
