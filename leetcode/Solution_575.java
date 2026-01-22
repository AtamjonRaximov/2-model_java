package pdpuz;

import java.util.Set;
import java.util.TreeSet;

public class Solution_575 {
    public static void main(String[] args) {
        Solution_575 solution575 = new Solution_575();

        int[] candType = {1, 1, 2, 2, 3, 3};
        System.out.println(solution575.distributeCandies(candType));

    }

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new TreeSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(candyType.length / 2, set.size());
    }
}
