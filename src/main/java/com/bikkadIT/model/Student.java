package com.bikkadIT.model;

import javax.persistence.Entity;

@Entity
public class Student {
	
	Integer Studentid;
	
	String Studentname;
	
	String Studentemail;
	
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
