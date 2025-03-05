package com.sj.demo.controller;

import com.sj.demo.model.Employee;
import com.sj.demo.service.EmployeeService;
import com.sj.demo.service.EmployeeServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/v1")
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee){
        Employee employee1 = employeeServiceImpl.saveEmployee(employee);
        return ResponseEntity.ok(employee1);
    }
    @GetMapping("/v1")
    public ResponseEntity<Employee> getEmployee(@Valid @RequestBody Employee employee){
        Employee employee1 = employeeServiceImpl.saveEmployee(employee);
        return ResponseEntity.ok(employee1);
    }

}
