package com.tylersadler.dto;

import com.tylersadler.domain.AbstractDomainTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeDtoTest extends AbstractDomainTest<EmployeeDto> {
    @Test
    @Override
    public void testSetGetVariables() {
        EmployeeDto testObject = new EmployeeDto();
        baseTestSetGetVariables(testObject, Long.class, 1L, "employeeId");
        baseTestSetGetVariables(testObject, String.class, "00000", "employeeNumber");
        baseTestSetGetVariables(testObject, String.class, "Test", "firstName");
        baseTestSetGetVariables(testObject, String.class, "Test", "lastName");
        baseTestSetGetVariables(testObject, String.class, "3142870365", "phoneNumber");
    }

    @Test
    public void testConstructorSetsEmployeeDto(){
        EmployeeDto testObject = new EmployeeDto(1L, "Test", "Test",
                "3142870365", "0000");

        assertEquals("Test", testObject.getFirstName());
        assertEquals("Test", testObject.getLastName());
        assertEquals("3142870365", testObject.getPhoneNumber());
        assertEquals("0000", testObject.getEmployeeNumber());
    }
}