package org.example.prac;

import org.example.LinkedList.Node.Node;

import java.util.*;

public class prac {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //head.next.next.next.next.next = head;

        Node slow = head;
        Node fast = head;

        boolean hasCycle = false;

        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                hasCycle=true;
                break;
            }
        }
        System.out.println(hasCycle);
    }


}
