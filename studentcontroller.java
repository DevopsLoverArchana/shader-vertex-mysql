package com.example.studentdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdatabase.model.student;
import com.example.studentdatabase.service.studentservice;

@RestController
public class studentcontroller {

	@Autowired
	private studentservice studservice;
	@GetMapping("/studentdata")
	public List<student> getstudent()
	{
	
		return this.studservice.getStudentData();
		
	}
	
}
