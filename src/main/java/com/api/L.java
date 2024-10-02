package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// length of a each word.
public class L{
    public static void main(String[] args){
        List<String> data = Arrays.asList("Amir","Akash","Aman","Adesh");
        List<Integer> newdata = data.stream().map(x->x.length()).collect(Collectors.toList());
        System.out.println(newdata);
    }
}
