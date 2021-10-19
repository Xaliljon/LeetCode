package uz.peachdev.uz.leetcode;

public class RunningSumof1dArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            int len = nums.length -1;
            for(int i=0; i<len; i++){
                nums[i+1] = nums[i]+nums[i+1];
            }
            return nums;
        }
    }
}
