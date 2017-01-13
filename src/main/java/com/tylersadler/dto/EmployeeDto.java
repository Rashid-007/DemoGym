package com.tylersadler.dto;

import com.tylersadler.domain.AbstractPerson;


public class EmployeeDto extends AbstractPerson{
    private Long employeeId;
    private String employeeNumber;

    public EmployeeDto(Long employeeId, String firstName,
                       String lastName, String phoneNumber, String employeeNumber){
        this.employeeId = employeeId;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.employeeNumber = employeeNumber;
    }

    public EmployeeDto(){}

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
