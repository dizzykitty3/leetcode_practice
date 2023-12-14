package me.dizzykitty3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // test outputs here
        Solution solution = new Solution();

        // 1. Two Sum
        System.out.println(Arrays.equals(solution.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1}));
        System.out.println(Arrays.equals(solution.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2}));
        System.out.println(Arrays.equals(solution.twoSum(new int[]{3, 3}, 6), new int[]{0, 1}));

    }
}