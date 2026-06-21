/*
Problem: Search Insert Position
LeetCode: 35
Difficulty: Easy
Topic: Binary Search

Problem Link:
https://leetcode.com/problems/search-insert-position/

Date Solved:
21-06-2026
*/

class Solution {

    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target)
                return mid;

            if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return start;
    }
}
