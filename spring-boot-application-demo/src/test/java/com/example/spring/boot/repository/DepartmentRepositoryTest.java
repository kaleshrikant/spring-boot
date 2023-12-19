package com.example.spring.boot.repository;

import com.example.spring.boot.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;


    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("Mechanical Engineering")
                        .departmentCode("ME-011")
                        .departmentAddress("Pune")
                        .departmentId(011L)
                .build();
        entityManager.persist(department);
    }

    @Test
    @DisplayName("")
    public void whenFindById_thenReturnDepartment() {
        Optional<Department> department = departmentRepository.findById(011L);
        assertEquals(department.get().getDepartmentName(),"Mechanical Engineering");
    }
}