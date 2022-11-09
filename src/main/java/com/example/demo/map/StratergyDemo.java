package com.example.demo.map;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StratergyDemo {

    public static int totalValues(List<Integer> numbers, Predicate<Integer> selector){
      return numbers.stream().filter(selector).mapToInt(e -> e).sum();
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        //Cohesive way of implementation
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(totalValues(numbers, ignore -> true));
        System.out.println(totalValues(numbers, StratergyDemo::isEven));
        System.out.println(totalValues(numbers, StratergyDemo::isOdd));
    }
}
