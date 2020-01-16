package com.wd.departmentApplication.department.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity registerDepartment(@RequestBody(required= true) Department department){
        departmentService.registerDepartment(department);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity <List<Department>> getAllDepartment(){
        List<Department> dept = departmentService.getAllDepartment();
        return new ResponseEntity(dept,HttpStatus.OK);
    }

    @GetMapping("{department_id}")
    public ResponseEntity<Department> getDepartment(@PathVariable(value="department_id") Integer department_id){
       Department department= departmentService.getDepartment(department_id);
        return new ResponseEntity(department,HttpStatus.OK);
    }

    @PutMapping("{department_id}")
    public ResponseEntity updateDepartment(@PathVariable(value="department_id") Integer department_id,@RequestBody(required= true) Department department){
        departmentService.updateDepartment(department_id,department);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("{department_id}")
    public ResponseEntity deleteDepartment(@PathVariable(value="department_id") Integer department_id){
        departmentService.deleteDepartment(department_id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
