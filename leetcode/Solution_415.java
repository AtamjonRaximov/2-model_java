package pdpuz;

public class Solution_415 {
    public static void main(String[] args) {
        Solution_415 sol1 = new Solution_415();
        String str1 = "456";
        String str2 = "77";

        System.out.println(sol1.addStrings(str1, str2));

    }

    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            sb.append(sum % 10);
            i--;
            j--;

        }
        return sb.reverse().toString();

    }
}
