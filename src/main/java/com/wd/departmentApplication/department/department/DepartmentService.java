package com.wd.departmentApplication.department.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void registerDepartment(Department department){
        departmentRepository.save(department);
    }

    public List<Department> getAllDepartment(){
        List<Department> dept_list=departmentRepository.findAll();
        return dept_list;
    }

    public Department getDepartment(int department_id){
        Optional<Department> department=departmentRepository.findById(department_id);
        return department.get();
    }

    public void updateDepartment(int department_id,Department department){
        department.setDepartment_id(department_id);
        departmentRepository.save(department);
    }

    public void deleteDepartment(int department_id){
        departmentRepository.deleteById(department_id);
    }
}
