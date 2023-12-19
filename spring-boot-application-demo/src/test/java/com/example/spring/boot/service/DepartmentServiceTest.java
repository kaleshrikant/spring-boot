package com.example.spring.boot.service;

import com.example.spring.boot.entity.Department;
import com.example.spring.boot.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {

    @MockBean
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentService departmentService;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentCode("Bangalore")
                        .departmentAddress("IT-003")
                        .departmentId(1L)
                .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(Optional.ofNullable(department));
    }

    @Test
    @DisplayName("Get Data based on Valid Department Name")
    // @Disabled
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "IT";
        Department found = departmentService.fetchDepartmentByNameIgnoreCase(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}