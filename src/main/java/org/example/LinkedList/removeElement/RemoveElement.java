package org.example.LinkedList.removeElement;

import org.example.LinkedList.Node.Node;

public class RemoveElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 4;

        Node dummy = new Node(-1);

        dummy.next = head;

        Node curr = dummy;

        while(curr.next!=null){
            if (curr.next.val == k) {
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        head = dummy.next;

        Node temp = head;
         while(temp!=null){
             System.out.println(temp);
             temp = temp.next;
         }
    }
}
