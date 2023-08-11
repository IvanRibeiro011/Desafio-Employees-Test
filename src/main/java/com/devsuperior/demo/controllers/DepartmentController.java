package com.devsuperior.demo.controllers;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
