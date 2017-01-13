package com.tylersadler.controller;

import com.tylersadler.domain.Employee;
import com.tylersadler.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

    @Mock
    private EmployeeService mockEmployeeService;

    @InjectMocks
    private EmployeeController testObject;

    @Test
    public void testFindAllCallsServiceFindAll(){
        testObject.findAll();
        Mockito.verify(mockEmployeeService).findAll();
    }
}
