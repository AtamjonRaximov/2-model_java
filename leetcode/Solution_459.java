package pdpuz;

public class Solution_459 {
    public static void main(String[] args) {
        Solution_459 solution459 = new Solution_459();

        String s = "abab";
        System.out.println(solution459.repeatedSubstringPattern(s));

    }

    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }
}
