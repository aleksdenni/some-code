package myTests.arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrT {
    public static void main(String[] args) {
        new ListNode();
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode l3Start = new ListNode();
        while(l1 != null && l2 != null){
            int num = l1.val + l2.val;
            l3.val = num;
            if(l1.next != null){
                l3.next = new ListNode();
            }else l3.next = null;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l3Start != null){
            System.out.println(l3Start.val);
            l3Start = l3Start.next;
        }
        return l3Start;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
