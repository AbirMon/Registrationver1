package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// we need numbers greater then 100
public class C {
    public static void main(String[] args){
        List<Integer> data = Arrays.asList(156,178,234,300,48);
        List<Integer> newdata = data.stream().filter(x->x>100).collect(Collectors.toList());
        System.out.println(newdata);
    }
}
