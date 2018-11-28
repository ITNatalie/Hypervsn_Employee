package com.company;

import com.company.audit.Management;
import com.company.model.Employee;

public class Main {

    public static void main(String[] args) {
	//    Employee Ivan

        Employee employeeIvan = new Employee(1, "Ivan", "Ivanov", 20, "junior");
        employeeIvan.toPrintEmloyeeData();

        Management foremployeeIvan = new Management(employeeIvan, "accounting");
        String fullName = foremployeeIvan.getFullName();
        System.out.println(fullName);

        Integer countSalary = foremployeeIvan.getNewSalary();
        System.out.println("Salary is " + countSalary + " usd");


        /*    Employee Dima
        Employee employeeDima = new Employee(2, "Dima", "Petrov", 30, "senior");
        employeeDima.toPrintEmloyeeData();

        Management foremployeeDima = new Management(employeeDima, "accounting");
        String fullName = foremployeeDima.getFullName();
        System.out.println(fullName);

        Integer countSalary = foremployeeDima.getNewSalary();
        System.out.println("Salary is " + countSalary + " usd");

    }
}
