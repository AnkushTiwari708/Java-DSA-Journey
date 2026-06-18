/*
Problem: Best Time to Buy and Sell Stock
LeetCode: 121
Difficulty: Easy
Topic: Arrays

Problem Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
Date Solved:
18-06-2026
*/
class Solution {
    public int maxProfit(int[] prices) {
        int minvalue = prices[0], maxprofit = 0;
        for(int i:prices)
        {   if(minvalue>i)
            minvalue=i;
            int profit =i - minvalue ;
            if(maxprofit<profit)
            maxprofit=profit;
        }
        return maxprofit;
    }
}
