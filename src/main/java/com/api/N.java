package com.api;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Remove the duplicate names.
public class N {
    public static void main(String[] args){
        List<String> data = Arrays.asList("Avi","Amit","Amar","Ravi","Avi");
        List<String> newdata = data.stream().distinct().collect(Collectors.toList());
        System.out.println(newdata);
    }
}
