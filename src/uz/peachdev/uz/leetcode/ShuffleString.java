package uz.peachdev.uz.leetcode;

public class ShuffleString {
    class Solution {
        public String restoreString(String s, int[] indices) {
            char[] res = new char[s.length()];

            for(int i = 0; i < s.length(); i++){
                res[indices[i]] = s.charAt(i);
            }

            return String.valueOf(res);
        }
    }
}
