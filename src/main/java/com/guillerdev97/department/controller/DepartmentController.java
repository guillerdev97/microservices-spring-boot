package com.guillerdev97.department.controller;

import com.guillerdev97.department.entity.Department;
import com.guillerdev97.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/departments")
@Slf4j
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(Logger log, DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of the DepartmentController");
        return departmentService.saveDepartment(department);
    }
}
