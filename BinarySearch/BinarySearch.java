/*
Problem: Binary Search
LeetCode: 704
Difficulty: Easy
Topic: Binary Search

Problem Link:
https://leetcode.com/problems/binary-search/

Date Solved:
19-06-2026
*/
class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (nums[mid]==target)
            {
                return mid;
            }
           else if (target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
