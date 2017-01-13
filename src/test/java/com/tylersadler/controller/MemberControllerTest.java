package com.tylersadler.controller;

import com.tylersadler.service.EmployeeService;
import com.tylersadler.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MemberControllerTest {
    @Mock
    private MemberService mockMemberService;

    @InjectMocks
    private MemberController testObject;

    @Test
    public void testFindAllCallsServiceFindAll(){
        testObject.findAll();
        Mockito.verify(mockMemberService).findAll();
    }
}
