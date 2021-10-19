package uz.peachdev.uz.leetcode;

public class DefangingAnIPAddress {
    class Solution {
        public String defangIPaddr(String address) {
            String a = address.replace(".","[.]");
            return a;
        }
    }
}
