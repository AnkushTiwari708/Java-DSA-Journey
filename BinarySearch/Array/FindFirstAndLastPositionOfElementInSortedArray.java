/*
Problem: Find First and Last Position of Element in Sorted Array
LeetCode: 34
Difficulty: Medium
Topic: Binary Search,Array

Problem Link:
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Date Solved:
18-06-2026
*/

class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    private int findLast(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
