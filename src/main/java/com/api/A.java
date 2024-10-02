package com.api;

import java.net.InterfaceAddress;
import java.util.function.Predicate;

public class A {
    public static void main(String[] args){
     //Functional Predicate Interface
     //It takes the input and give the output in Boolean.
     // x->(Lamdas Expression)
     Predicate<Integer> val = x->x<100;
     Boolean result = val.test(50);
     System.out.println(result);
    }
}
