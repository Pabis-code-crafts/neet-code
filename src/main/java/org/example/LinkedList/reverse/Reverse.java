package org.example.LinkedList.reverse;

import org.example.LinkedList.Node.Node;

public class Reverse {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node prev = null;
        Node curr = head;


        // understanding purpose
        Node temp1 = head;
        System.out.println(temp1.next.next);
        System.out.println(temp1.next);
        System.out.println(curr.next);
        //

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp);
            temp =  temp.next;
        }

        System.out.println(prev);
    }
}
