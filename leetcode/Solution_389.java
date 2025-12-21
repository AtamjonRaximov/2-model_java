package pdpuz;

public class Solution_389 {
    public static void main(String[] args) {
        Solution_389 solution389 = new Solution_389();

        String s = "abcd";
        String t = "abcde";
        System.out.println(solution389.findTheDifference(s, t));

    }

    public char findTheDifference(String s, String t) {
        int total = 0;

        for (int i = 0; i < t.length(); i++) {
            total = total + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            total = total - s.charAt(i);
        }

        return (char) total;
    }
}
