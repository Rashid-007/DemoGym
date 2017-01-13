package com.tylersadler.dto;

import com.tylersadler.domain.AbstractDomainTest;
import com.tylersadler.dto.MemberDto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberDtoTest extends AbstractDomainTest<MemberDto> {
    @Test
    @Override
    public void testSetGetVariables(){
        MemberDto testObject = new MemberDto();
        baseTestSetGetVariables(testObject, Long.class, 1L, "memberId");
        baseTestSetGetVariables(testObject, String.class, "Test", "firstName");
        baseTestSetGetVariables(testObject, String.class, "Test", "lastName");
        baseTestSetGetVariables(testObject, String.class, "3142870365", "phoneNumber");
    }

    @Test
    public void testConstructorSetsMember(){
        MemberDto testObject = new MemberDto(1L, "Test", "Test",
                "3142870365");

        assertEquals("Test", testObject.getFirstName());
        assertEquals("Test", testObject.getLastName());
        assertEquals("3142870365", testObject.getPhoneNumber());
    }
}
