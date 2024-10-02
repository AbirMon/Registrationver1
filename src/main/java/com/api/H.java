package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find square of each number using stream api.
// we will use here map method.
// Map method uses Function Functional Interface.
public class H{
    public static void main(String[] args){
        List<Integer> data = Arrays.asList(2,4,6,8,9,10);
        List<Integer> newdata = data.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(newdata);
    }
}

