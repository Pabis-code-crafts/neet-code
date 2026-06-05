package org.example.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelement {
    public static void main(String[] args) {
        Queue<Integer> que= new LinkedList<>();
        Stack<Integer> sta2 = new Stack<>();
        Queue<Integer> que2= new LinkedList<>();

        que.offer(1);
        que.offer(2);
        que.offer(3);
        que.offer(4);
        que.offer(5);
        que.offer(6);
        que.offer(7);
        que.offer(8);
        int k = 5;

        for (int i = 0; i < k; i++) {
            sta2.add(que.remove());
        }
        System.out.println(que);
        System.out.println(sta2);
        while(!sta2.empty()){
            que2.offer(sta2.pop());
        }
        System.out.println(que);
        while (!que.isEmpty()) {
            que2.offer(que.remove());
        }
        System.out.println(que2);



    }

}
