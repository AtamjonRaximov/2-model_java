package pdpuz;

public class Solution_2413 {
    public static void main(String[] args) {
        Solution_2413 sol1 = new Solution_2413();
        int n = 6;

        System.out.println(sol1.smallestEvenMultiple(n));

    }

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return  n*2;

        }


    }
}
