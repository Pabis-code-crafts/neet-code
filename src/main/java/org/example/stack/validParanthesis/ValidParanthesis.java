package org.example.stack.validParanthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([]){}";
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> sta = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                sta.pop();
            }else {
                sta.push(ch);
            }
        }

        if (sta.isEmpty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
