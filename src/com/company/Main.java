package com.company;

import com.company.audit.Management;
import com.company.model.Employee;
import com.sun.javafx.image.IntPixelGetter;

public class Main {

    public static void main(String[] args) {


        Management management = new Management("accounting");

        //    Employee Ivan Ivanov
        Employee employeeIvan = new Employee(1, "Ivan", "Ivanov", 20, "junior");
        // System.out.println(employeeIvan.toPrintEmloyeeData());

        //    Employee Vasya Lapkin
        Employee employeeVasya = new Employee(2, "Vasya", "Lapkin", 27, "junior");
        //  System.out.println(employeeVasya.toPrintEmloyeeData());

        //   Employee Lesha Petrov
        Employee employeeLesha = new Employee(3, "Lesha", "Petrov", 33, "middle");
        // System.out.println(employeeLesha.toPrintEmloyeeData());

        //   Employee Marta Hudson
        Employee employeeMarta = new Employee(4, "Marta", "Hudson", 42, "senior");
        // System.out.println(employeeMarta.toPrintEmloyeeData());


        management.addEmployee(employeeMarta, 0);
        management.addEmployee(employeeIvan, 1);
        management.addEmployee(employeeLesha, 2);
        management.addEmployee(employeeVasya, 3);

        /*вариант 1
                Employee employeeZero = management.getEmployee(0);
        System.out.println(employeeZero.toPrintEmloyeeData());

        //или вариант 2
        System.out.println(management.getEmployee(1).toPrintEmloyeeData());
        System.out.println(management.getEmployee(2).toPrintEmloyeeData());
        System.out.println(management.getEmployee(3).toPrintEmloyeeData());
        */

        /*for (int i = 0; i < 10; i++) {
            Employee curentEmployee = management.getEmployee(i);
            if (curentEmployee != null) {                   //== - сравнить ссылки  != - не равны
                System.out.println(curentEmployee.toPrintEmloyeeData());
            }
        }
        */


        for (int i = 0; i < management.getEmployees().length; i++) {
            Employee curentEmployee = management.getEmployee(i);
            if (curentEmployee != null) {
                if (curentEmployee.getJobPosition().equals("junior")) {
                    curentEmployee.setSalary(curentEmployee.getSalary() + 300);
                };
                if (curentEmployee.getJobPosition() == "middle") {                  // alt + enter = equels
                    curentEmployee.setSalary(curentEmployee.getSalary() + 500);
                };
                if (curentEmployee.getJobPosition() == "senior") {
                    curentEmployee.setSalary(curentEmployee.getSalary() + 1000);
                };
                System.out.println(curentEmployee.toPrintEmloyeeData() + ", salary is " + curentEmployee.getSalary());
            }
         }
         


    }
}








/*
//    Employee Ivan Ivanov

        Employee employeeIvan = new Employee(1, "Ivan", "Ivanov", 20, "junior");
        employeeIvan.toPrintEmloyeeData();

        Management foremployeeIvan = new Management(employeeIvan, "accounting");
        String fullName = foremployeeIvan.getFullName();
        System.out.println(fullName);

        Integer countSalary = foremployeeIvan.getNewSalary();
        System.out.println("Salary is " + countSalary + " usd");


     //    Employee Vasya Lapkin



        Employee employeeVasya = new Employee(2, "Vasya", "Lapkin", 27, "junior");
        employeeVasya.toPrintEmloyeeData();

        Management foremployeeVasya = new Management(employeeVasya, "accounting");
        String fullName2 = foremployeeVasya.getFullName();
        System.out.println(fullName2);

        Integer countSalary2 = foremployeeVasya.getNewSalary();
        System.out.println("Salary is " + countSalary2 + " usd");

     //   Employee Dima Petrov

        Employee employeeDima = new Employee(3, "Dima", "Petrov", 33, "middle");
        employeeDima.toPrintEmloyeeData();

        Management foremployeeDima = new Management(employeeDima, "accounting");
        String fullName3 = foremployeeDima.getFullName();
        System.out.println(fullName3);

        Integer countSalary3 = foremployeeDima.getNewSalary();
        System.out.println("Salary is " + countSalary3 + " usd");


     //   Employee Marta Hudson

        Employee employeeAnna = new Employee(4, "Marta", "Hudson", 42, "senior");
        employeeAnna.toPrintEmloyeeData();

        Management foremployeeAnna = new Management(employeeAnna, "accounting");
        String fullName4 = foremployeeAnna.getFullName();
        System.out.println(fullName4);

        Integer countSalary4 = foremployeeAnna.getNewSalary();
        System.out.println("Salary is " + countSalary4 + " usd");
    }
 */
