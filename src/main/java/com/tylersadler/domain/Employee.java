package com.tylersadler.domain;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee extends AbstractPerson{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Employee_Id")
    private Long employeeId;

    @Column(name = "Employee_Number")
    private String employeeNumber;

    public Employee(Long employeeId, String firstName, String lastName,
                   String phoneNumber, String employeeNumber){
        this.employeeId = employeeId;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.employeeNumber = employeeNumber;
    }

    public Employee(){}

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
