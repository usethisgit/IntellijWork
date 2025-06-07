//Merge two sorted Linked lists and return it as a new List.

import java.util.LinkedList;

public class MergeTwoLists {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(5);
        l1.add(8);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(3);
        l2.add(9);
        l2.add(11);
        l2.add(18);
        System.out.println(l1);
    }
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    if (l1.val < l2.val) {
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    } else {
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }
}
}
