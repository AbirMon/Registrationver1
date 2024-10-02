package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class A6 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println(min.get());
    }
}
