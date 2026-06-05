package org.example.stack.stacksort;

import java.util.Arrays;
import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {

        Stack<Integer> sta = new Stack<>();
        sta.addAll(Arrays.asList(34, 3, 31, 98, 92, 23));
        Stack<Integer> arranged = new Stack<>();
        while (!sta.isEmpty()) {
            int x = sta.pop();

            while (!arranged.isEmpty() && arranged.peek() > x) {
                sta.push(arranged.pop());
            }

            arranged.push(x);
        }
        System.out.println(arranged);
    }
}
