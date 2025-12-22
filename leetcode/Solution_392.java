package pdpuz;

public class Solution_392 {
    public static void main(String[] args) {
        Solution_392 solution392 = new Solution_392();

        String s = "abc";
        String t = "ahbgdc";
        System.out.println(solution392.isSubsequence(s, t));

    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int i = 0;
        int j = 0;
        while (i<s.length() && j<t.length()){
            if (s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else {
                j++;
            }
        }
        if (i==s.length()) return true;
        return false;

    }
}
