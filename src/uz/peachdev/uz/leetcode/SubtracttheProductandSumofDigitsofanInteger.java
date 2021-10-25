package uz.peachdev.uz.leetcode;

public class SubtracttheProductandSumofDigitsofanInteger {
    class Solution {
        public int subtractProductAndSum(int n) {
            int sod=0;
            int pod=1;
            while(n != 0){
                int a=n%10;
                sod=sod+a;
                pod=pod*a;
                n=n/10;
            }
            return pod-sod;

        }
    }
}
