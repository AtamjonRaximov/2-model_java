package pdpuz;

public class Solution_191 {
    public static void main(String[] args) {
        Solution_191 solution191 = new Solution_191();

        int n = 11;
        System.out.println(solution191.hammingWeight(n));


    }

    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((mask & n) != 0) {
                bits++;
            }
            mask <<= 1;

        }
        return bits;
    }
}
