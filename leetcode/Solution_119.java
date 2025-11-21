package pdpuz;

import java.util.ArrayList;
import java.util.List;

public class Solution_119 {
    public static void main(String[] args) {
        Solution_119 solution119 = new Solution_119();

        int rowindex = 3;
        System.out.println(solution119.getRow(rowindex));

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex < 0) return res;
        res.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = res.size() - 1; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
            res.add(1);
        }
        return res;
    }
}
