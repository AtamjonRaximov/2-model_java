package pdpuz;

public class Solution_367 {
    public static void main(String[] args) {
        Solution_367 solution367 = new Solution_367();

        int num = 1;
        System.out.println(solution367.isPerfectSquare(num));

    }

    public boolean isPerfectSquare(int num) {
        int min = 1;
        int max = 46340;
        while (min <= max) {
            int mid = (min + max) / 2;
            int product = mid * mid;
            if (product == num) {
                return true;
            }else if (product < num) {
                min = mid + 1;
            }else  {
                max = mid - 1;
            }
        }
        return false;
    }
}
