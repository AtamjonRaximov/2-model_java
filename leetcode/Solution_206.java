package pdpuz;

public class Solution_206 {
    public static void main(String[] args) {
        Solution_206 sol1 = new Solution_206();
        ListNode206 n1 = new ListNode206(1);
        ListNode206 n2 = new ListNode206(2);
        ListNode206 n3 = new ListNode206(3);
        ListNode206 n4 = new ListNode206(4);
        ListNode206 n5 = new ListNode206(5);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        ListNode206 reversed = sol1.reverseList(n1);
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }


    }

    public ListNode206 reverseList(ListNode206 head) {
        if (head == null) return null;

        ListNode206 cur = head, pre = null;

        while (cur != null) {
            ListNode206 temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;


    }
}
