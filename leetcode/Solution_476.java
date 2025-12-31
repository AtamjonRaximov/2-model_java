package pdpuz;

public class Solution_476 {
    public static void main(String[] args) {
        Solution_476 solution476 = new Solution_476();

        int num = 5;
        System.out.println(solution476.findComplement(num));

    }

    public int findComplement(int num) {
        int ones = 0;

        while (ones < num) ones = (ones << 1) | 1;

        return ones - num;
    }
}
