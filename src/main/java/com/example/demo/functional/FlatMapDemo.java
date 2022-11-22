package com.example.demo.functional;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapDemo {


    public static void main(String[] args) {

/*
# Stream<String[]>
# Stream<Stream<String>>
# String[][]
 */

      int[][] twoDimensionalArray =   {{1, 2}, {3, 4},{5, 6}};


        IntStream intStream = Arrays.stream(twoDimensionalArray).flatMapToInt(IntStream::of);
        System.out.println(intStream.boxed().collect(Collectors.toList()));
        System.out.println(Arrays.stream(twoDimensionalArray).flatMapToInt(IntStream::of).boxed().collect(Collectors.toList()));

        Function<String, Integer> fun1 = x-> x.length();
        Function<Integer, Integer> fun2 = x -> x * 2;

        System.out.println(fun1.andThen(fun2).apply("Chethan"));
    }
}
