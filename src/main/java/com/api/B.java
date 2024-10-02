package com.api;
//Check the given names is same or not
// same --> true
// not same --> false

import java.util.function.Predicate;

public class B {
    public static void main(String[] args){
       Predicate<String> val = x->x.equals("Anil");
        boolean result = val.test("Anil");
        System.out.println(result);
    }
}
