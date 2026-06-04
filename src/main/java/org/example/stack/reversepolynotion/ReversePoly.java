package org.example.stack.reversepolynotion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReversePoly {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        Set<String> operands = new HashSet<>();
        operands.addAll(Arrays.asList("+","-","*","%"));
        Stack<String> sta = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if(!operands.contains(tokens[i])){
                sta.add(tokens[i]);
            }else{
                int r = Integer.parseInt(sta.pop());
                int l = Integer.parseInt(sta.pop());

                if(tokens[i].equals("+")){
                    sta.add(Integer.toString(l+r));
                } else if (tokens[i].equals("-")) {
                    sta.add(Integer.toString(r-l));
                } else if (tokens[i].equals("*")) {
                    sta.add(Integer.toString(l*r));
                }else{
                    sta.add(Integer.toString(r/l));
                }

            }
        }
        System.out.println(sta.pop());

    }
}
