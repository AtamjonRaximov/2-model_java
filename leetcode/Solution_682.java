package pdpuz;

import com.sun.jdi.IntegerValue;

import java.util.LinkedList;

public class Solution_682 {
    public static void main(String[] args) {
        Solution_682 solution682 = new Solution_682();

        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(solution682.calPoints(operations));

    }

    public int calPoints(String[] operations) {
        LinkedList<Integer> res = new LinkedList<>();

        for (String op : operations) {
            if (op.contains("+")) {
                res.add(res.get(res.size() - 1) + res.get(res.size() - 2));

            } else if (op.contains("D")) {
                res.add(res.get(res.size() - 1) * 2);

            } else if (op.contains("C")) {
                res.removeLast();

            } else {
                res.add(Integer.valueOf(op));
            }

        }

        return res.stream().mapToInt(Integer::intValue).sum();

    }
}
