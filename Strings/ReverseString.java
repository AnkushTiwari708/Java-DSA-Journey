/*
Problem: Reverse String
LeetCode: 344
Difficulty: Easy
Topic: Strings, Two Pointers

Problem Link:
https://leetcode.com/problems/reverse-string/

Date Solved:
22-06-2026
*/

class Solution {

    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while(start < end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
