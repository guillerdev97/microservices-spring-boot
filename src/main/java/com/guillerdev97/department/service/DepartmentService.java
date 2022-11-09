package com.guillerdev97.department.service;

import com.guillerdev97.department.entity.Department;
import com.guillerdev97.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of the DepartmentService");
        return departmentRepository.save(department);
    }

   /* public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of the DepartmentService");
        return departmentRepository.findDepartmentById(departmentId);
    }*/
}
