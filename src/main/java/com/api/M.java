package com.api;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//sorted() --> It can sort both string and numbers.
public class M{
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(100,23,90,67,200);
        List<Integer> newdata = data.stream().sorted().collect(Collectors.toList());
        System.out.println(newdata);
    }
}
