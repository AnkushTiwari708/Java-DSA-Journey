/*
Problem: Majority Element
LeetCode: 169
Difficulty: Easy
Topic: Arrays, Boyer-Moore Voting Algorithm

Problem Link:
https://leetcode.com/problems/majority-element/

Date Solved:
20-06-2026
*/

class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int candidate = 0;

        for(int num : nums)
        {
            if(count == 0)
                candidate = num;

            if(candidate == num)
                count++;
            else
                count--;
        }

        return candidate;
    }
}
