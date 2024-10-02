package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Convert given String to Uppercase.
public class J{
    public static void main(String[] args){
        List<String> data = Arrays.asList("Amit","Aman","Amar","Akash");
        List<String> newdata = data.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(newdata);
    }
}