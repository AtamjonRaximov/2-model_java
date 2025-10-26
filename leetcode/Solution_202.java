package pdpuz;

import java.util.HashSet;
import java.util.Set;

public class Solution_202 {
    public static void main(String[] args) {
        int n = 19;
        Solution_202 sol1 = new Solution_202();
        System.out.println(sol1.isHappy(n));

    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (!seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int tmp = n % 10;
                sum += tmp * tmp;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;

    }
}
