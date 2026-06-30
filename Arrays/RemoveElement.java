/*
Problem: Remove Element
LeetCode: 27
Difficulty: Easy
Topic: Arrays, Two Pointers

Problem Link:
https://leetcode.com/problems/remove-element/

Date Solved:
29-06-2026
*/

class Solution {

    public int removeElement(int[] nums, int val) {

        int j = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
