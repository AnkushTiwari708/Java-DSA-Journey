/*
Problem: Longest Common Prefix
LeetCode: 14
Difficulty: Easy
Topic: Strings

Problem Link:
https://leetcode.com/problems/longest-common-prefix/

Date Solved:
24-06-2026
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
        return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {  
            if(!strs[i].startsWith(prefix))
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                return "";
                i--;
            }
        }
        return prefix;
    }
}
