gipackage pdpuz;

public class Solution_441 {
    public static void main(String[] args) {
        Solution_441 solution441 = new Solution_441();

        int n = 5;
        System.out.println(solution441.arrangeCoins(n));

    }

    public int arrangeCoins(int n) {
        long left = 0, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == n) {
                return (int) mid;
            } else if (coins < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }
}
