package com.microserviceTuto.department.service;

import com.microserviceTuto.department.entity.Department;
import com.microserviceTuto.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDeprtment(Department department) {
        log.info("Inside the saveDepartment of the DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId){
        log.info("Inside the findDepartmentById of the DepartmentService");
        return departmentRepository.findByDepartementId(departmentId);
    }
}
