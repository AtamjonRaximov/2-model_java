package pdpuz;

import java.util.HashSet;
import java.util.Set;

public class Solution_409 {
    public static void main(String[] args) {
        Solution_409 solution409 = new Solution_409();

        String s = "abccccdd";
        System.out.println(solution409.longestPalindrome(s));

    }

    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int length = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                length += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return set.size() > 0 ? length + 1 : length;


    }
}
