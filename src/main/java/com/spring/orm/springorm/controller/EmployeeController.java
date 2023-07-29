package com.spring.orm.springorm.controller;

import com.spring.orm.springorm.entity.EmployeeEntity;
import com.spring.orm.springorm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee/{id}")
    public EmployeeEntity getEmployee(@PathVariable("id") Long id) {
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteById(id);
    }

    @PostMapping("/employee")
    public void addEmployee(@RequestBody EmployeeEntity employee) {
        employeeService.saveOrUpdate(employee);
    }

    @PutMapping("/employee")
    public void updateEmployee(@RequestBody EmployeeEntity employee) {
        employeeService.saveOrUpdate(employee);
    }
}
