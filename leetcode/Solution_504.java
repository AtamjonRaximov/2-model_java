package pdpuz;

public class Solution_504 {
    public static void main(String[] args) {
        Solution_504 solution504 = new Solution_504();

        int num = 100;
        System.out.println(solution504.convertToBase7(num));

    }

    public String convertToBase7(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        boolean neg =(num < 0);

        while (Math.abs(num) > 0) {
            int digit = Math.abs(num) % 7;
            sb.insert(0, digit);
            num /= 7;
        }
        if (neg) sb.insert(0, "-");

        return sb.toString();
    }
}
