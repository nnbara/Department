package com.wd.departmentApplication.department.department;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int department_id;
    private String name;
    private String domain;
    private String budget;
    private String start_date;
    private String department_head;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getStartDate() {
        return start_date;
    }

    public void setStartDate(String startDate) {
        this.start_date = startDate;
    }

    public String getDepartment_head() {
        return department_head;
    }

    public void setDepartment_head(String department_head) {
        this.department_head = department_head;
    }



}
