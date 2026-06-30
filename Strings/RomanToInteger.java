/*
Problem: Roman to Integer
LeetCode: 13
Difficulty: Easy
Topic: Strings

Problem Link:
https://leetcode.com/problems/roman-to-integer/

Date Solved:
30-06-2026
*/

class Solution {
    public int romanToInt(String s) {

        int i = 0;
        int[] arr = new int[s.length()];

        for(char ch : s.toCharArray()) {

            switch(ch) {
                case 'I': arr[i] = 1; break;
                case 'V': arr[i] = 5; break;
                case 'X': arr[i] = 10; break;
                case 'L': arr[i] = 50; break;
                case 'C': arr[i] = 100; break;
                case 'D': arr[i] = 500; break;
                case 'M': arr[i] = 1000; break;
            }

            i++;
        }

        int result = 0;

        for(int j = 0; j < arr.length; j++) {

            if(j < arr.length - 1 && arr[j] < arr[j + 1])
                result -= arr[j];
            else
                result += arr[j];
        }

        return result;
    }
}
