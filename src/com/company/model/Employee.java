package com.company.model;

public class Employee {
    private Integer id;
    private String firstname;
    private String surname;
    private Integer age;
    private String jobPosition;
    private Integer salary = 0;


    Employee() {
        jobPosition = "junior";
    }

    public Employee(Integer idX, String nameX, String surnameX, Integer ageX, String jobPositionX) {
        this.id = idX;
        this.firstname = nameX;
        this.surname = surnameX;
        if (isAdult(ageX)) {
            this.age = ageX;
        }
        this.jobPosition = jobPositionX;
    }

    private boolean isAdult(Integer checkAge) {
        if (checkAge >= 18) {
            //System.out.println(this.name + " " + this.surname + " can be employed");
            return true;
        } else {
            //System.out.println(this.name + " " + this.surname + " can't employed");
            return false;
        }
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setAge(Integer newAge) {
        boolean check = isAdult(newAge);
        if (check) {
            this.age = newAge;
        }
    }
    public Integer getAge() {
        return age;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
    public String getJobPosition() {
        return jobPosition;
    }

    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String toPrintEmloyeeData() {
        return (id) + " - " + (firstname) + " " + (surname) + ", job position is " + (jobPosition);
    }

}



/*    public Integer toGetNewSalary() {
        if(getJobPosition() == "junior"){  //сравниваем содержимое объектов (equels)
            salary = getSalary() + 300;
        }
        if(getJobPosition() == "middle"){
            salary = getSalary() + 500;
        }
        if(getJobPosition() == "senior"){
            salary = getSalary() + 1000;
        }
        return salary;
    }
}

*/
