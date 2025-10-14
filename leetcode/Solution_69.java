package pdpuz;

public class Solution_69 {
    public static void main(String[] args) {
        Solution_69 sol1 = new Solution_69();
        System.out.println(sol1.mySqrt(8));

    }

    public int mySqrt(int x) {
        int i = 0;

        while ((long) i * i <= x) {
            i++;
        }
        i = i - 1;
        return i;

    }
}
