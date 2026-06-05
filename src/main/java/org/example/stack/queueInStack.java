package org.example.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueInStack {
    public static void main(String[] args) {
        Queue<Integer> sta = new LinkedList<>();

        sta.offer(-2);
        sta.offer(0);
        sta.offer(-3);
        sta.offer(4);

        for (int i = 0; i < sta.size()-1; i++) {
            sta.offer(sta.remove());
        }

        System.out.println(sta.remove());
        System.out.println(sta.peek());



    }
}
