package com.example.spring.boot.controller;

import com.example.spring.boot.entity.Department;
import com.example.spring.boot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{departmentId}")
    public Department fetchDepartmentById(@PathVariable("departmentId") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{departmentId}")
    public String deleteDepartmentById(@PathVariable("departmentId") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully..!!";
    }
    @PutMapping("/departments/{departmentId}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("departmentId") Long departmentId) {
        return departmentService.updateDepartment(department,departmentId);
    }
    @GetMapping("/departments/{departmentName}")
    public Department fetchDepartmentByName(@PathVariable("departmentName") String departmentName) {
        return departmentService.fetchDepartmentByName(departmentName);
    }
    @GetMapping("/departments/{departmentName}")
    public Department fetchDepartmentByNameIgnoreCase(@PathVariable("departmentName") String departmentName) {
        return departmentService.fetchDepartmentByNameIgnoreCase(departmentName);
    }
}
