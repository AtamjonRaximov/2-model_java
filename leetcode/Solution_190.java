package pdpuz;

public class Solution_190 {
    public static void main(String[] args) {
        Solution_190 solution190 = new Solution_190();

        int n = 43261596;
        System.out.println(solution190.reverseBits(n));

    }

    public int reverseBits(int n) {
        int rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            rev |= (n & 1);
            n >>= 1;

        }
        return rev;

    }
}
