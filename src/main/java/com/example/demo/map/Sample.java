package com.example.demo.map;

import java.util.List;
import java.util.Optional;

public class Sample {

    public static Optional<String> getName(){
        if(Math.random() > 0.5){
            return Optional.of("Joe");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        var result = getName();
        System.out.println(result.orElse("Not found"));

        ///

        var names = List.of("Dory","Gill","Bruce", "abcd");
        names.stream()
                .filter(name -> name.length()==4)
                .map(String::toString)
                .forEach(System.out::println);

    }
}
