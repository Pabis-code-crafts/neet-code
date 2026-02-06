package org.example.LinkedList.MiddleOfTheLinkedList;


import org.example.LinkedList.Node.Node;

public class MidLInkList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node slow = head;
        Node fast = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.toString());

    }
}
