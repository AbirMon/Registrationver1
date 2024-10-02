package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Give me those names greater then 4
public class O{
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Aman","Devam","Rupam","Amar");
        List<String> newdata = data.stream().filter(x->x.length()>4).collect(Collectors.toList());
        System.out.println(newdata);
    }
}
