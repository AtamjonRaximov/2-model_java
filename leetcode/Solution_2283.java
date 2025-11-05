package pdpuz;

public class Solution_2283 {
    public static void main(String[] args) {
        Solution_2283 sol1 = new Solution_2283();

        String st1 = "1210";
        System.out.println(sol1.digitCount(st1));

    }

    public boolean digitCount(String num) {
        int[] arr = new int[10];

        for (char ch : num.toCharArray()) {
            arr[ch - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i)-'0';
            if (arr[i] != digit) {
                return false;
            }
        }
        return true;

    }
}
