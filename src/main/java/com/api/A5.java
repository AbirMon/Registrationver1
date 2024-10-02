package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class A5{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
