package pdpuz;

public class Solution_693 {
    public static void main(String[] args) {
        Solution_693 solution693 = new Solution_693();

        int n = 5;
        System.out.println(solution693.hasAlternatingBits(n));

    }

    public boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        for (int i = 1; i < bits.length(); i++) {
            if (bits.charAt(i) == bits.charAt(i - 1)) return false;
        }
        return true;
    }
}
