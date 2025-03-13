package com.vti.testing.controller;

import com.vti.testing.entity.Department;
import com.vti.testing.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/departments")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping
    public void createDepartment(@RequestBody Department department){ // @RequestBody: lấy thông tin client truyền trong body
        departmentService.createDepartment(department);
    }
}
