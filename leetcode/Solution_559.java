package pdpuz;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_559 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    public static void main(String[] args) {
        Solution_559 solution559 = new Solution_559();

        Node root = new Node();
        root.val = 3;
        System.out.println(solution559.maxDepth(root));

    }

    public int maxDepth(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;

        for (int size = queue.size(); !queue.isEmpty(); size = queue.size()) {
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                for (Node child : node.children) {
                    queue.offer(child);
                }
            }
            res++;
        }
        return res;
    }
}
