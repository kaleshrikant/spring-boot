package com.example.spring.boot.service;

import com.example.spring.boot.entity.Department;
import com.example.spring.boot.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public  List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Department department, Long departmentId);

    public Department fetchDepartmentByName(String departmentName);

    public Department fetchDepartmentByNameIgnoreCase(String departmentName);
}
