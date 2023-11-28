package com.example.studentdatabase.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.studentdatabase.model.student;

@Repository
public interface studentservice {

	public List<student> getStudentData();
	
	
	
}
