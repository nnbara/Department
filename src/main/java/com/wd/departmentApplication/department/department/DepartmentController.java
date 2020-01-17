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
    private DepartmentService departmentService; // Injecting dependency

    /* Registering Departments */
    @PostMapping
    public ResponseEntity registerDepartment(@RequestBody(required= true) Department department){
        departmentService.registerDepartment(department);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    /* Display entire department details stored in database */
    @GetMapping
    public ResponseEntity <List<Department>> getAllDepartment(){
        List<Department> dept = departmentService.getAllDepartment();
        return new ResponseEntity(dept,HttpStatus.OK);
    }

    /* Display specific department details */
    @GetMapping("{departmentId}")
    public ResponseEntity<Department> getDepartment(@PathVariable(value="departmentId") Integer departmentId){
       Department department= departmentService.getDepartment(departmentId);
        return new ResponseEntity(department,HttpStatus.OK);
    }

    /* Update specific department details */
    @PutMapping("{departmentId}")
    public ResponseEntity updateDepartment(@PathVariable(value="departmentId") Integer departmentId,@RequestBody(required= true) Department department){
        departmentService.updateDepartment(departmentId,department);
        return new ResponseEntity(HttpStatus.OK);
    }

    /* Delete specific department details */
    @DeleteMapping("{departmentId}")
    public ResponseEntity deleteDepartment(@PathVariable(value="departmentId") Integer departmentId){
        departmentService.deleteDepartment(departmentId);
        return new ResponseEntity(HttpStatus.OK);
    }


}
