package com.sj.demo.controller;

import com.sj.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    //private List<Student> list;

    /*@Autowired(required = false)
    private StudentService studentService;

    @GetMapping("/get")
    public List<Student> getData() {
        return studentService.getAllStudents();
    }

    @GetMapping("get/{id}")
    public Map<String, Integer> getById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }*/
}
