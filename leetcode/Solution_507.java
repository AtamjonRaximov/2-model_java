package pdpuz;

public class Solution_507 {
    public static void main(String[] args) {
        Solution_507 solution507 = new Solution_507();

        int num = 28;
        System.out.println(solution507.checkPerfectNumber(num));

    }

    public boolean checkPerfectNumber(int num) {
        if (num == 0 || num == 1) return false;

        int sum = 0;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }
        return num == sum + 1;

    }
}
