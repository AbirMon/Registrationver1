package com.api;

import java.util.function.Function;
// Find the length of a word.
public class F{
    public static void main(String[] args){
        // Function Functional Interface
        // It takes input and produce an output.
        Function<String,Integer> x = s->s.length();
        Integer result = x.apply("Ramesh");
        System.out.println(result);
    }
}
