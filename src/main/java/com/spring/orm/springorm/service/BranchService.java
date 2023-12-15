package com.spring.orm.springorm.service;

import com.spring.orm.springorm.entity.Branch;
import com.spring.orm.springorm.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public void saveBranch(Branch branch) {
        branchRepository.save(branch);
    }
}
