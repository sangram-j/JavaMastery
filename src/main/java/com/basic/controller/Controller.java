package com.basic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.model.Student;

@RestController
public class Controller {
	
	//private List<Student> list;

	@GetMapping("/get")
	public List<Student> getData() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("sangram", "latur"));
		System.out.println(list);
		return list;
	}
	
	public void getData1() {
		
	}
}
