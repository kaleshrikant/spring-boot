package com.example.spring.boot.service;

import com.example.spring.boot.entity.Department;
import com.example.spring.boot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.findById(departmentId);
    }

    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        Department dbDept = departmentRepository.findById(departmentId).get();
            if (Objects.nonNull(dbDept.getDepartmentName()) && !"".equalsIgnoreCase(dbDept.getDepartmentName())) {
                dbDept.setDepartmentName(department.getDepartmentName());
            }
            if (Objects.nonNull(dbDept.getDepartmentCode()) && !"".equalsIgnoreCase(dbDept.getDepartmentCode())) {
                dbDept.setDepartmentCode(department.getDepartmentCode());
            }
            if (Objects.nonNull(dbDept.getDepartmentAddress()) && !"".equalsIgnoreCase(dbDept.getDepartmentAddress())) {
                dbDept.setDepartmentAddress(department.getDepartmentAddress());
            }
        return departmentRepository.save(dbDept);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName).get();
    }

    @Override
    public Department fetchDepartmentByNameIgnoreCase(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName).get();
    }
}
