package pdpuz;

public class Solution_292 {
    public static void main(String[] args) {
        Solution_292 solution292 = new Solution_292();

        int n = 4;
        System.out.println(solution292.canWinNim(n));

    }

    public boolean canWinNim(int n) {
        if (n == 1) return true;
        if (n % 4 == 0) return false;
        return true;

    }
}
