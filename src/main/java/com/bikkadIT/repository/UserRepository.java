package com.bikkadIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.model.Student;
@Repository
public interface UserRepository extends JpaRepository<Student, Integer>{

	public Student getByStudentAge (int studentAge);	
	
}
