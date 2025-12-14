package pdpuz;

public class Solution_326 {
    public static void main(String[] args) {
        Solution_326 soultion326 = new Solution_326();

        int n = 45;
        System.out.println(soultion326.isPowerOfThree(n));

    }

    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
