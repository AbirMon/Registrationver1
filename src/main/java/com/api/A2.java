package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Display the name starts with m.
public class A2 {
    public static void main(String[] args){
        List<Employee> data = Arrays.asList(
                new Employee(1, "mike", 4000),
                new Employee(2, "anup", 5000),
                new Employee(3, "Animesh", 7000)
        );
        List<Employee>newdata = data.stream().filter(e -> e.getName().startsWith("m")).collect(Collectors.toList());
        for(Employee emp:newdata){
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSal());
        }
    }
}
