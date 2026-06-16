/*
Problem: Move Zeroes
LeetCode: 283
Difficulty: Easy
Topic: Arrays, Two Pointers

Problem Link:
https://leetcode.com/problems/move-zeroes/description/
Date Solved:
15-06-2026
*/
class Solution {
    public void moveZeroes(int[] nums)
    {
         int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
               nums[index]=nums[i];
               index++;
            }
        }
        while(index<nums.length)
        {
            nums[index]=0;
            index++;
        }
    }
}
