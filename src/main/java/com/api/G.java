package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


//Square of a number
public class G{
    public static void main(String[] args){
        //Function Functional Interface
        //It takes an input and produce an output.
        Function<Integer,Integer> x = s->s*s;
        Integer result = x.apply(15);
        System.out.println(result);
    }
}
