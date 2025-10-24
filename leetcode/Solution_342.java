package pdpuz;

public class Solution_342 {
    public static void main(String[] args) {
        Solution_342 sol1 = new Solution_342();
        System.out.println(sol1.isPowerOfFour(1));

    }
    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }

        while (n != 1) {
            if (n % 4 != 0) {
                return false;
            } else {
                n = n / 4;
            }
        }
        return true;

    }
}
