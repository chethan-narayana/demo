package com.example.demo.map;

import java.util.*;
import java.util.stream.Collectors;

public class SampleTest {

    public static void main(String[] args) {
        String input = "Harry chases around grass mayur manish mal";
        System.out.println(" " + input.lines().collect(Collectors.joining()));
//test
        System.out.println(Arrays.stream(input.split(" ")).filter(data -> data.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == data.length()).collect(Collectors.toList()));
        System.out.println(Arrays.asList(input.split(" ")).stream().filter(data -> data.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == data.length()).collect(Collectors.toList()));

    }



    //System.out.println(Arrays.asList(input.split(" ")).stream().filter(data -> data.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == data.length()).collect(Collectors.toList()));

    //        System.out.println(Arrays.asList(input.split(" ")).stream().filter(data -> {
    //            Set<Character> items = new HashSet<>();
    //
    //             data.chars().mapToObj(c -> (char) c).filter(c -> !items.add(c)).count();
    //            return items.size() == data.length();
    //
    //        }).collect(Collectors.toList()));
}
