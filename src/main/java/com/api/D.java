package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Display the names / words starting with m
public class D {
    public static void main(String[] args){
        List<String> data = Arrays.asList("madam","me","maya","abir","aman");
        List<String> newdata = data.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
        System.out.println(newdata);
    }
}
