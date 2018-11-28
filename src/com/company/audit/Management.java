package com.company.audit;

import com.company.model.Employee;

public class Management {

    private String departmentName;
    private Employee employeeX;
    private Integer newSalary;


    public Management(Employee employeeX, String departmentName) {
        this.departmentName = departmentName;
        this.employeeX = employeeX;
    }


    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getFullName (){
        return this.employeeX.getFirstname() + " " + this.employeeX.getSurname();
    }

    public Integer getNewSalary (){
        if(employeeX.getJobPosition() == "junior"){  //сравниваем содержимое объектов (equels)
            newSalary = employeeX.getSalary() + 300;
        }
        if(employeeX.getJobPosition() == "middle"){
            newSalary = employeeX.getSalary() + 500;
        }
        if(employeeX.getJobPosition() == "senior"){
            newSalary = employeeX.getSalary() + 1000;
        }
        return newSalary;
    }
}


