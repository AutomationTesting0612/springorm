package com.spring.orm.springorm.repository;

import com.spring.orm.springorm.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
