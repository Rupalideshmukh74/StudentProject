package com.bikkadIT.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ID")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STUDENT_ID")
	Integer Studentid;
	
	@Column(name="STUDENT_NAME")
	String Studentname;
	
	@Column(name="STUDENT_EMAIL")
	String Studentemail;
	
	@Column(name="STUDENT_AGE")
	String Studentage;

	public Integer getStudentid() {
		return Studentid;
	}

	public void setStudentid(Integer studentid) {
		Studentid = studentid;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getStudentemail() {
		return Studentemail;
	}

	public void setStudentemail(String studentemail) {
		Studentemail = studentemail;
	}

	public String getStudentage() {
		return Studentage;
	}

	public void setStudentage(String studentage) {
		Studentage = studentage;
	}

	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", Studentname=" + Studentname + ", Studentemail=" + Studentemail
				+ ", Studentage=" + Studentage + "]";
	}

	
}
