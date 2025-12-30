package pdpuz;

public class Solution_461 {
    public static void main(String[] args) {
        Solution_461 solution461 = new Solution_461();

        int x = 1;
        int y = 4;
        System.out.println(solution461.hammingDistance(x, y));

    }

    public int hammingDistance(int x, int y) {
        int res = 0;

        while (x != 0 || y != 0) {
            int a = (x & 1),
                    b = (y & 1);
            res += ((a ^ b) == 1) ? 1 : 0;
            x >>= 1;
            y >>= 1;
        }


        return res;
    }
}
