package com.example.zoo;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Zoo {
    private Collection<Employee> employees;
    private Map<Employee, Collection<Enclosure>> assignments;
    private Map<String, Integer> foodStorage;
    private int funds;

    public Zoo(int funds){
        this.funds = funds;
        this.foodStorage = new HashMap<>();
        this.assignments = new HashMap<>();
        this.employees = new HashSet<>();
    }

    public boolean hireEmployee(Employee employee){
        if (employee.getSalary() > funds){
            return false;
        }
        employees.add(employee);
        assignments.put(employee, new HashSet<>());
        return true;
    }
}
