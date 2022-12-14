package com.example.demo.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class SortDemo {

    public static void main(String[] args) {
        //sort map by values
        //Map.Entry , Comparator

        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120);
        budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("zmiscellneous", 90);

        System.out.println("Before sorting " + budget);

        Map<String, Integer> sorted = budget.entrySet().stream().sorted(comparingByKey()).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));

        Map<String, Integer> sortedReverse = budget.entrySet().stream().sorted(comparingByKey(Comparator.reverseOrder())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));

        System.out.println("After Sorting " + sorted);
        System.out.println("After Sorting Reverse order " + sortedReverse);
        //sort map by keys

    }
}
