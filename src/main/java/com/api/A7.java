package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A7 {
    public static void main(String[] args){
        List<Integer> data  = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, Long> newdata = data.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(newdata);
    }
}
