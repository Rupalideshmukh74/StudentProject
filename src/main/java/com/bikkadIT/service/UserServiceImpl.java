package com.bikkadIT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIT.model.Student;
import com.bikkadIT.repository.UserRepository;
@Service
public class UserServiceImpl implements UserServiceI{
	
	@Autowired
	private UserRepository userRepository;

	
	@Override
	public int addStudent(Student student) {
		
		Student save = userRepository.save(student);
		return save.getStudentId();
	}

	


	@Override
	public List<Student> getAllStudent() {
		
		List<Student> findAll = userRepository.findAll();
		return findAll;
	}



	@Override
	public Student getByStudentAge(int studentAge) {
		 Student byStudentage = userRepository.getByStudentAge(studentAge);
		return byStudentage;
	}



	

	

	

}
