package com.example.spring.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank (message = "DEPARTMENT NAME MUST NOT BE EMPTY")
/*  @Length(max = , min = , message = "")
    @Size
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Past
    @PastOrPresent
    @Future
    @FutureOrPresent
*/
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}