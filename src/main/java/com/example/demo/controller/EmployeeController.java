package com.example.demo.controller;

import com.example.demo.DTO.commonResponseDTO;
import com.example.demo.DTO.employeeDTO;
import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.JPA.EmployeeJPA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeJPA employeeJPA;
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public commonResponseDTO getAllEmployeeList() throws Exception{
        List<EmployeeEntity> data=employeeJPA.findAll();
        return commonResponseDTO.builder().data(data).status("Success").build();
    }
    @PostMapping(value="/add",consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public employeeDTO addEmployee( @Validated @RequestBody EmployeeEntity req) throws Exception{
        if (req.getName().isEmpty()|| req.getName()==null){
            throw new RuntimeException();
        }
        employeeJPA.save(req);
        return employeeDTO.builder().empId(req.getEmpID()).name(req.getName()).enable(req.isEnable()).Status("Success").build();
    }
}
