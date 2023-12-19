package me.dizzykitty3;

public class Solution {
    /**
     * 1. Two Sum [Easy] #Array #HashTable
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */
    public int[] twoSum(int[] nums, int target) {
        final int length = nums.length;
        for (int i = 0; i < length; i++) {
            int gap = target - nums[i]; // Avoid doing extensive addition operations
            for (int j = i + 1; j < length; j++) { // j starts with i + 1
                if (nums[j] == gap) return new int[]{i, j}; // Return the answer
            }
        }
        return new int[]{-1, -1}; // Return [-1, -1] if there is no answer
    }
}
