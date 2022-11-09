package com.example.demo.generics;

public class GenricDemo {

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(23);
        Printer<String> stringPrinter = new Printer<>("This is string");
        Printer<Double> doublePrinter = new Printer<>(23.33);
        integerPrinter.print();
        stringPrinter.print();
    }
}
