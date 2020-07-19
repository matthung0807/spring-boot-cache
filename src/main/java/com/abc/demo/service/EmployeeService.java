package com.abc.demo.service;

import com.abc.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    public Employee getEmployeeById(Long id) {
        Map<Long, Employee> currentEmployeeMap = getCurrentEmployeeMap();
        return currentEmployeeMap.get(id);
    }

    private Map<Long, Employee> getCurrentEmployeeMap() {
        Map<Long, Employee> currentEmployeeMap = new HashMap<>();
        currentEmployeeMap.put(1L, Employee.builder().id(1L).name("alan").age(33).build());
        currentEmployeeMap.put(2L, Employee.builder().id(2L).name("bill").age(45).build());
        currentEmployeeMap.put(3L, Employee.builder().id(3L).name("carl").age(24).build());
        currentEmployeeMap.put(4L, Employee.builder().id(4L).name("dave").age(31).build());
        return currentEmployeeMap;
    }

}
