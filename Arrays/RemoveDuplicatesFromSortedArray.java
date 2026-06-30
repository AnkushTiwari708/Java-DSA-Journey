/*
Problem: Remove Duplicates from Sorted Array
LeetCode: 26
Difficulty: Easy
Topic: Arrays, Two Pointers

Problem Link:
https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Date Solved:
24-06-2026
*/

class Solution {

    public int removeDuplicates(int[] nums) {

        int j = 1;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i - 1])
            {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
