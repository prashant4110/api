package com.example.demo.JPA;

import com.example.demo.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJPA extends JpaRepository<EmployeeEntity, Long> {

}
