package pdpuz;

public class Solution_160 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Solution_160 solution160 = new Solution_160();

        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);

        System.out.println(solution160.getIntersectionNode(headA, headB));

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;

    }
}
