/*
Problem: Two Sum
LeetCode: 1
Difficulty: Easy
Topic: Arrays

Problem Link:
https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

Date Solved:
14-06-2026
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] index = new int[2];

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(target == nums[i] + nums[j]) {

                    index[0] = i;
                    index[1] = j;

                    return index;
                }
            }
        }

        return index;
    }
}
