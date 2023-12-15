package com.spring.orm.springorm.controller;

import com.spring.orm.springorm.entity.Branch;
import com.spring.orm.springorm.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
@RequestMapping("/app")
public class BranchController {

    @Autowired
    private BranchService branchService;


    @PostMapping("/branch")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Branch> addBranch(@RequestBody Branch branch) {
        branchService.saveBranch(branch);
        return ResponseEntity.ok(branch);
    }

}
