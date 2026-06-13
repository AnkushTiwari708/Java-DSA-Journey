/*
Problem: Richest Customer Wealth
LeetCode: 1672
Difficulty: Easy
Topic: Arrays, 2D Arrays

Problem Link:
https://leetcode.com/problems/richest-customer-wealth/?envType=problem-list-v2&envId=array
*/

class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;
        int columns = accounts[0].length;

        for(int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for(int j = 0; j < columns; j++) {
                sum += accounts[i][j];
            }

            if(maxWealth < sum) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
