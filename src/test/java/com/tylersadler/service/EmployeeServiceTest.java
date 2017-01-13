package com.tylersadler.service;

import com.tylersadler.domain.Employee;
import com.tylersadler.dto.EmployeeDto;
import com.tylersadler.repository.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
    @Mock
    private EmployeeRepository mockEmployeeRepository;

    @InjectMocks
    private EmployeeService testObject;

    private Employee employee;
    private Employee employee2;
    private Employee employee3;

    private List<Employee> employeeList;

    @Before
    public void setUp(){
        employee = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();

        employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
    }

    @Test
    public void testWhenFindAllIsCalledItReturnsListOfEmployeeDtos(){
        when(mockEmployeeRepository.findAll()).thenReturn(employeeList);
        List<EmployeeDto> actual = testObject.findAll();
        assertEquals(3, actual.size());
    }

    @Test
    public void testWhenFindAllIsCalledAndRepoHasErrorItReturnsNullList(){
        when(mockEmployeeRepository.findAll()).thenThrow(new NullPointerException());
        List<EmployeeDto> actual = testObject.findAll();
        assertEquals(null, actual);
    }
}
