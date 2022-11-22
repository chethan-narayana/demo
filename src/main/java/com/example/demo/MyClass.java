package com.example.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
    public static void main(String args[]) {
        String input = "heloo";
        //    String modified = new StringBuilder(input);
        System.out.println(Stream.of(input).map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" ")));
        int a[] = {1,3,1,2,3,4,2,1,4,5,6};
        Map<Integer, Long> countMap = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);
    }
}
