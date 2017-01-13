package com.tylersadler.service;

import com.tylersadler.domain.Employee;
import com.tylersadler.dto.EmployeeDto;
import com.tylersadler.repository.EmployeeRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private static final Log LOGGER = LogFactory.getLog(EmployeeService.class);

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDto> findAll() {
        try{
            List<Employee> employeeList = employeeRepository.findAll();
            List<EmployeeDto> dtoList = new ArrayList<>();

            for (Employee employee: employeeList) {
                EmployeeDto employeeDto = new EmployeeDto(employee.getEmployeeId(),
                        employee.getFirstName(), employee.getLastName(), employee.getPhoneNumber(),
                        employee.getEmployeeNumber());

                dtoList.add(employeeDto);
            }

            return dtoList;
        } catch (Exception e){
            LOGGER.error("Find All",e);
            return null;
        }
    }
}