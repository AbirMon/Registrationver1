package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a given String to Lowercase
public class K{
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Aman","Amar","Abhik","Ravi");
        List<String> newdata = data.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
        System.out.println(newdata);
    }
}