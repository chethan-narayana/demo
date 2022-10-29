package com.example.demo.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a","b");

        List<String> upperCaseList = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCaseList);
    }
}
