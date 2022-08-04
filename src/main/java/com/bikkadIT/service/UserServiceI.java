package com.bikkadIT.service;

import java.util.List;

import com.bikkadIT.model.Student;

public interface UserServiceI {
	
	 public int addStudent(Student student);
	
	public List<Student>  getAllStudent();
	
	public Student getByStudentAge(int studentAge);

}
