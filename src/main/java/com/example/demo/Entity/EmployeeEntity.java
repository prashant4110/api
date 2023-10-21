package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name="employee")
public class EmployeeEntity {
    @Id
    @Column(name="emp_Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empID;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="enable", nullable = false)
    private boolean enable;
}
