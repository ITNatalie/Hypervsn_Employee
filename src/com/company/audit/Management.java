package com.company.audit;

import com.company.model.Employee;

public class Management {

    private String departmentName;
    private Employee[] employees = new Employee[10];


    public Management(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee, Integer index) {
        this.employees[index] = employee;                              //в ячейку массива emloyees под понером index добавляется employee (типа set-ер)
    }
    public Employee getEmployee(Integer index) {                      // достать из ячейки index Employee (гетер)
        return employees[index];
    }


}


/*
   private String departmentName;
    private Employee employeeX;
    private Integer newSalary;



    public Management(Employee employee String departmentName) {
        this.departmentName = departmentName;
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
 */