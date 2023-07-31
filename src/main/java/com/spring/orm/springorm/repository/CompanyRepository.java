package com.spring.orm.springorm.repository;

import com.spring.orm.springorm.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {


}
