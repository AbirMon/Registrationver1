package com.api;
// Even number --> t->t%2==0
// Odd number --> t->t%2!=0
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E {
   public static void main(String[] args){
       List<Integer> data = Arrays.asList(2,4,6,8,11,13);
       List<Integer> newdata = data.stream().filter(t->t%2==0).collect(Collectors.toList());
       System.out.println(newdata);
   }
}
