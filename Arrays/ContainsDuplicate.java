/*
Problem: Contains Duplicate
LeetCode: 217
Difficulty: Easy
Topic: Arrays, HashSet

Problem Link:
https://leetcode.com/problems/contains-duplicate/?envType=problem-list-v2&envId=array
Date Solved:
14-06-2026
*/

import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums) {

            if(set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }

        return false;
    }
}
