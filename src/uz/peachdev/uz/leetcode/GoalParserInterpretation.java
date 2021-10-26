package uz.peachdev.uz.leetcode;

public class GoalParserInterpretation {
    class Solution {
        public String interpret(String command) {
            String a = command.replace("()","o");
            String b = a.replace("G","G");
            String c = b.replace("(al)","al");
            return c;
        }
    }
}
