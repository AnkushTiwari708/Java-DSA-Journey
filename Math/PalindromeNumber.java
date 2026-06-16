/*
Problem: Palindrome Number
LeetCode: 9
Difficulty: Easy
Topic: Math

Problem Link:
https://leetcode.com/problems/palindrome-number/
Date Solved:
16-06-2026
*/

class Solution {

    public boolean isPalindrome(int x) {

        if(x < 0)
            return false;

        int temp = x;
        long reverse = 0;

        while(temp > 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        return x == reverse;
    }
}
