package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//  Add 5 to all numbers
// Function Functional Interface uses Map method.
public class I {
    public static void main(String[] args){
        List<Integer> data = Arrays.asList(10,15,20,25,30);
        List<Integer> newdata = data.stream().map(x->x+5).collect(Collectors.toList());
        System.out.println(newdata);
    }
}
