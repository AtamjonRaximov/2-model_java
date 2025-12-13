package pdpuz;

import java.util.Arrays;

public class Solution_238 {
    public static void main(String[] args) {
        Solution_238 s = new Solution_238();

        int n = 5;
        System.out.println(Arrays.toString(s.countBits(n)));

    }

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            res[i] = res[i & (i - 1)] + 1;
        }
        return res;
    }
}
