package pdpuz;

public class Solution_509 {
    public static void main(String[] args) {
        Solution_509 solution509 = new Solution_509();

        int num=2;
        System.out.println(solution509.fib(num));
    }
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
