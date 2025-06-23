#Leetcode 796
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s+s).contains(goal);
    }
} #time complexity = o(N) 
