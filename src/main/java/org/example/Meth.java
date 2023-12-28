package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Meth {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!brackets.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (brackets.get(c) != top) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
