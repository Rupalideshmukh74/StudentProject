package com.bikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.model.Student;
import com.bikkadIT.service.UserServiceI;

@RestController
public class StudentController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@PostMapping("/addStudent")
	 public int addStudent(@RequestBody Student student) {
		int addStudent = userServiceI.addStudent(student);
		return addStudent;
		
	}
	@GetMapping (value="/getAllStudent",consumes={"application/json","application/xml"},produces= {"application/json","application/xml"})
	public List<Student> getAllStudent() {
		List<Student> allStudent = userServiceI.getAllStudent();
		System.out.println(allStudent);
		
		return allStudent;
	
	}
	
	@GetMapping (value="/getByAge/{studentAge}",consumes={"application/json","application/xml"},produces= {"application/json","application/xml"})
	public Student getByAge(@PathVariable int studentAge) {
		Student byStudentAge = userServiceI.getByStudentAge(studentAge);
		
		return byStudentAge;
	
	}

}
