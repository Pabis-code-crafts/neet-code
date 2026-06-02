package org.example.LinkedList.palindrome;

import org.example.LinkedList.Node.Node;

public class Palindrome {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);


        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.toString());

        Node prev = null;
        while(slow!=null){
            Node nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        while(prev!=null){
            if(prev.val==head.val){
                prev=prev.next;
                head=head.next;
            }else{
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");



    }
}
