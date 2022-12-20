package Algoritm;

import java.util.ArrayDeque;
import java.util.List;

public class Skobki {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        List<Character> openBraces = List.of('{', '(', '[');

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (openBraces.contains(curChar)) {
                stack.push(curChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if ((curChar == ')' && stack.peek() == '(') ||
                        (curChar == ']' && stack.peek() == '[') ||
                        (curChar == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}