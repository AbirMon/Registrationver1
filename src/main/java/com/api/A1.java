package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A1 {
    public static void main(String[] args){
        List<Employee> data = Arrays.asList(
                new Employee(1, "mike", 4000),
                new Employee(2, "stallin", 7000),
                new Employee(3, "avik", 3000)
        );
        List<Employee> newdata = data.stream().filter(e -> e.getSal() > 4000).collect(Collectors.toList());
        for(Employee emp: newdata){
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSal());
        }
    }
}
