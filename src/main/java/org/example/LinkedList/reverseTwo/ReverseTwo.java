package org.example.LinkedList.reverseTwo;

import org.example.LinkedList.Node.Node;

public class ReverseTwo {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int left = 2;
        int right = 4;
        Node dummy = new Node(-1);
        dummy.next = head;

        Node prev = dummy;
        for (int i = 1; i < left; i++) {

            prev = prev.next;
        }

//        System.out.println(prev);


        Node curr = prev.next;

        for (int i = 0; i < right - left; i++) {
            Node nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
        head = dummy.next;
        while(head!=null){
            System.out.println(head);
            head =  head.next;

        }


    }
}
