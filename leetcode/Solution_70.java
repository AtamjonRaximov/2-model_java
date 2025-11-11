package pdpuz;

public class Solution_70 {
    public static void main(String[] args) {
        Solution_70 sol1 = new Solution_70();

        int n = 4;
        System.out.println(sol1.climbStairs(n));

    }

    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        int a = 3;
        int b = 2;
        for (int i = 0; i < n - 3; i++) {
            a = a + b;
            b = a - b;

            System.out.println(a + "ffff" + b);
        }
        return a;
    }
}
