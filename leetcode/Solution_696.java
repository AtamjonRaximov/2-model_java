package pdpuz;

public class Solution_696 {
    public static void main(String[] args) {
        Solution_696 solution696 = new Solution_696();

        String s = "00110011";
        System.out.println(solution696.countBinarySubstrings(s));

    }

    public int countBinarySubstrings(String s) {
        int count = 0, i = 1, prev = 0, curr = 1;
        while (i < s.length()) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            } else {
                curr++;
            }
            i++;
        }
        return count += Math.min(curr, prev);

    }
}
