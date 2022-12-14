package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDemo {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 11, 15};
        int target =9;
        int[] indices = findTwoSum(nums, target);
        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }

    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
