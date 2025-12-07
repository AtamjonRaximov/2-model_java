package pdpuz;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution_234 {
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
        Solution_234 solution234 = new Solution_234();

        ListNode head = new ListNode(1);

        System.out.println(solution234.isPalindrome(head));

    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        List<Integer> list = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
