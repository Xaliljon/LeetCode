package uz.peachdev.uz.leetcode;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] a = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(a)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}

