package pdpuz;

public class Solution_231 {
    public static void main(String[] args) {
        Solution_231 sol1 = new Solution_231();

        System.out.println(sol1.isPowerOfTwo(16));

    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            } else {
                n = n / 2;
            }
        }
        return true;

    }
}
