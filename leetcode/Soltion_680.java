package pdpuz;

public class Soltion_680 {
    public static void main(String[] args) {
        Soltion_680 soltion680 = new Soltion_680();

        String s = "aba";
        System.out.println(soltion680.validPalindrome(s));

    }

    public boolean validPalindrome(String s) {
        int L = 0, R = s.length() - 1;

        while (L < R) {
            if (s.charAt(L) == s.charAt(R)) {
                L++;
                R--;
            } else {
                return validPalindrome(s, L + 1, R) ||
                        validPalindrome(s, L, R - 1);
            }
        }
        return true;

    }

    public boolean validPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
