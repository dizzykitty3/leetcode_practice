package me.dizzykitty3;

public class Main {
    public static void main(String[] args) {
        // Test outputs here
        Solution solution = new Solution();

//        System.out.println("1. Two Sum");
//        System.out.println(Arrays.equals(solution.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1}));
//        System.out.println(Arrays.equals(solution.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2}));
//        System.out.println(Arrays.equals(solution.twoSum(new int[]{3, 3}, 6), new int[]{0, 1}));

        System.out.println("9. Palindrome Number");
        final int input1 = 121;
        final int input2 = -121;
        final int input3 = 10;
        final boolean output1 = true;
        final boolean output2 = false;
        final boolean output3 = false;
        System.out.println(solution.isPalindrome(input1) == output1);
        System.out.println(solution.isPalindrome(input2) == output2);
        System.out.println(solution.isPalindrome(input3) == output3);
        System.out.println(solution.isPalindrome(12321) == true);
        System.out.println(solution.isPalindrome(969) == true);
        System.out.println(solution.isPalindrome(123) == false);
        System.out.println(solution.isPalindrome(12334) == false);
        System.out.println(solution.isPalindrome(331) == false);
        System.out.println(solution.isPalindrome(666) == true);
        System.out.println(solution.isPalindrome(0) == true);
    }
}