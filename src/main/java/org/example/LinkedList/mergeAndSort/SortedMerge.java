package org.example.LinkedList.mergeAndSort;

import org.example.LinkedList.Node.Node;

public class SortedMerge {
    public static void main(String[] args) {
        Node list1 = new Node(2);
        list1.next = new Node(5);
        list1.next.next = new Node(7);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(6);
        list2.next.next.next = new Node(8);

        Node list3 = new Node(-1);
        Node head = list3;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                list3.next = list1;
                list1 = list1.next;
            }else{
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next;
        }

        if(list1!=null){
            list3.next=list1;
        }
        if(list2!=null){
            list3.next=list2;
        }


        head= head.next;
        while(head!=null){
            System.out.println(head);
            head = head.next;
        }





    }
}