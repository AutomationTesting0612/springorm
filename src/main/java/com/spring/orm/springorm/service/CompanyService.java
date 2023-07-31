package com.spring.orm.springorm.service;

import com.spring.orm.springorm.entity.Company;
import com.spring.orm.springorm.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    public void saveOrUpdate(Company entity) {

        companyRepository.save(entity);
    }

    public void deleteRecord(Long id) {

        companyRepository.deleteById(id);
    }
}
