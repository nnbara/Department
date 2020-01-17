package com.wd.departmentApplication.department.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository; // Injecting dependency

    /* Saving registered Departments in database */
    public void registerDepartment(Department department){
        departmentRepository.save(department);
    }

    /* To get entire department details stored in database */
    public List<Department> getAllDepartment(){
        List<Department> dept_list=departmentRepository.findAll();
        return dept_list;
    }

    /* To get specific department details from database */
    public Department getDepartment(int departmentId){
        Optional<Department> department=departmentRepository.findById(departmentId);
        return department.get();
    }

    /* To save updated department details in database*/
    public void updateDepartment(int departmentId,Department department){
        department.setDepartmentId(departmentId);
        departmentRepository.save(department);
    }

    /* To delete specific department details from database */
    public void deleteDepartment(int departmentId){
        departmentRepository.deleteById(departmentId);
    }
}
