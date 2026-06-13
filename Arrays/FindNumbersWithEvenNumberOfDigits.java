/*
Problem: Find Numbers with Even Number of Digits
LeetCode: 1295
Difficulty: Easy
Topic: Arrays

Problem Link:
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/?envType=problem-list-v2&envId=array
*/

class Solution {
    public int findNumbers(int[] nums) {

        int even = 0;

        for(int i = 0; i < nums.length; i++) {

            int digit = 0;
            int num = nums[i];

            while(num > 0) {
                digit++;
                num = num / 10;
            }

            if(digit % 2 == 0)
                even++;
        }

        return even;
    }
}
