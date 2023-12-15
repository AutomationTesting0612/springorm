package com.spring.orm.springorm.controller;

import com.spring.orm.springorm.entity.Company;
import com.spring.orm.springorm.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @GetMapping("/employee/{id}")
    public ResponseEntity<Optional<Company>> getEmployee(@PathVariable("id") Long id) {
        Optional<Company> company = companyService.findEmployeeById(id);

        if (company != null) {
            return ResponseEntity.ok(company);
        } else {
            // You might want to return a 404 Not Found status if the employee is not found
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        companyService.deleteRecord(id);
    }

    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Company> addEmployee(@RequestBody Company company) {
       companyService.saveOrUpdate(company);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(company.getCompanyId())
                .toUri();
        return ResponseEntity.created(location).body(company);
    }

    @PutMapping("/employee")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Company> updateEmployee(@RequestBody Company company) {
        companyService.saveOrUpdate(company);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(company.getCompanyId())
                .toUri();
        return ResponseEntity.created(location).body(company);
    }
}
