package com.example.spring.boot.controller;

import com.example.spring.boot.entity.Department;
import com.example.spring.boot.error.DepartmentNotFoundException;
import com.example.spring.boot.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartment() of DepartmentController.");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList() of DepartmentController.");
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{departmentId}")
    public Department fetchDepartmentById(@PathVariable("departmentId") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("Inside fetchDepartmentById() of DepartmentController.");
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{departmentId}")
    public String deleteDepartmentById(@PathVariable("departmentId") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        LOGGER.info("Inside deleteDepartmentById() of DepartmentController.");
        return "Department deleted successfully..!!";
    }
    @PutMapping("/departments/{departmentId}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("departmentId") Long departmentId) {
        LOGGER.info("Inside updateDepartment() of DepartmentController.");
        return departmentService.updateDepartment(department,departmentId);
    }
    @GetMapping("/departments/{departmentName}")
    public Department fetchDepartmentByName(@PathVariable("departmentName") String departmentName) {
        LOGGER.info("Inside fetchDepartmentByName() of DepartmentController.");
        return departmentService.fetchDepartmentByName(departmentName);
    }
    @GetMapping("/departments/{departmentName}")
    public Department fetchDepartmentByNameIgnoreCase(@PathVariable("departmentName") String departmentName) {
        LOGGER.info("Inside fetchDepartmentByNameIgnoreCase() of DepartmentController.");
        return departmentService.fetchDepartmentByNameIgnoreCase(departmentName);
    }
}
