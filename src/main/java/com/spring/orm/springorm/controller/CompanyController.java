package com.spring.orm.springorm.controller;

import com.spring.orm.springorm.entity.Company;
import com.spring.orm.springorm.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/emp")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


//    @GetMapping("/employee/{id}")
//    public Employee getEmployee(@PathVariable("id") Long id) {
//        return companyService.findEmployeeById(id);
//    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        companyService.deleteRecord(id);
    }

    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Company> addEmployee(@RequestBody Company company) {
       companyService.saveOrUpdate(company);
       return ResponseEntity.ok(company);
    }

    @PutMapping("/employee")
    public void updateEmployee(@RequestBody Company company) {
        companyService.saveOrUpdate(company);
    }
}
