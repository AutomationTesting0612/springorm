package com.spring.orm.springorm.service;

import com.spring.orm.springorm.entity.Employee;
import com.spring.orm.springorm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findEmployeeById(Long id) {
       return employeeRepository.findById(id).get();
    }

    public void saveOrUpdate(Employee entity) {

        employeeRepository.save(entity);
    }

    public void deleteById(Long id) {

        employeeRepository.deleteById(id);
    }
}
