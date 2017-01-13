package com.tylersadler.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberTest extends AbstractDomainTest<Member>{
    @Test
    @Override
    public void testSetGetVariables(){
        Member testObject = new Member();
        baseTestSetGetVariables(testObject, Long.class, 1L, "memberId");
        baseTestSetGetVariables(testObject, String.class, "Test", "firstName");
        baseTestSetGetVariables(testObject, String.class, "Test", "lastName");
        baseTestSetGetVariables(testObject, String.class, "3142870365", "phoneNumber");
    }

    @Test
    public void testConstructorSetsMember(){
        Member testObject = new Member(1L, "Test", "Test",
                "3142870365");

        assertEquals("Test", testObject.getFirstName());
        assertEquals("Test", testObject.getLastName());
        assertEquals("3142870365", testObject.getPhoneNumber());
    }
}
