package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A3 {
    public static void main(String[] args){
        List<Employee> data= Arrays.asList(
                new Employee(1, "anil", 7000),
                new Employee(2, "kumar", 5000),
                new Employee(3, "arun", 4000)
        );
        Map<Integer, List<Employee>> newdata = data.stream().collect(Collectors.groupingBy(e->e.getSal()));
        System.out.println(newdata);
    }
}
