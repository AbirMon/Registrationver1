package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Q{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abir","Hemant","Mayank");
        Consumer<String> val = s->System.out.println(s);
        names.forEach(val);
    }
}
