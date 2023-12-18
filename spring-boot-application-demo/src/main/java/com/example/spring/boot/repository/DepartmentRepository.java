package com.example.spring.boot.repository;

import com.example.spring.boot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByDepartmentName(String departmentName);

   // @Query(value = "jpql-query")
   // @Query(value = "select original_user_alias.* from SD_USER original_user_alias", nativeQuery = true, queryRewriter = MyQueryRewriter.class)
    Optional<Department> findByDepartmentNameIgnoreCase(String departmentName);
}