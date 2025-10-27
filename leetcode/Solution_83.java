package pdpuz;


import java.util.HashSet;
import java.util.Set;

public class Solution_83 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Solution_83 sol1 = new Solution_83();
        ListNode node1 = new ListNode(20);

        ListNode node2 = new ListNode(20);
        node1.next = node2;

        ListNode node3 = new ListNode(30);
        node2.next = node3;

        sol1.deleteDuplicates(node1);
        printList(node1);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode prev = head;
        ListNode temp = prev.next;

        while (temp != null) {
            if (temp.val == prev.val) {
                temp = temp.next;
                continue;
            }

            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
