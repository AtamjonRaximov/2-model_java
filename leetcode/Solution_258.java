package pdpuz;


public class Solution_258 {
    public static void main(String[] args) {
        Solution_258 sol1 = new Solution_258();
        System.out.println(sol1.addDigits(38));
    }

    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num / 10 == 0) {
            return num;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }


}
