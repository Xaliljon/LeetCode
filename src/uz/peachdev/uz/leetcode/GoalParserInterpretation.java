package uz.peachdev.uz.leetcode;

public class GoalParserInterpretation {
    class Solution {
        public String interpret(String command) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                char ch = command.charAt(i);
                int next = i + 1;
                if (ch == '(' || ch == 'a') {
                    if (command.charAt(next) == 'a') {
                        res.append("a");
                    } else if (command.charAt(next) == ')') {
                        res.append("o");
                    } else if (command.charAt(next) == 'l') {
                        res.append(command.charAt(next));
                    }
                } else {
                    if(ch == 'G')
                        res.append(ch);
                }
            }
            return res.toString();
        }
    }
}
