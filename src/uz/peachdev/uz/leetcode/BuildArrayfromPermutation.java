package uz.peachdev.uz.leetcode;

public class BuildArrayfromPermutation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] res = new int[nums.length];
            for (int i = 0; i<nums.length;i++){
                res[i] = nums[nums[i]];
            }
            return res;
        }
    }
}
