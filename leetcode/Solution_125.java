package pdpuz;

public class Solution_125 {
    public static void main(String[] args) {
        Solution_125 solution125 = new Solution_125();

        String str = "A man, a plan, a canal: Panama";
        System.out.println(solution125.isPalindrome(str));

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
