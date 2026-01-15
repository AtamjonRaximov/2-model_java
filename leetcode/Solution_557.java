package pdpuz;

import java.util.Arrays;

public class Solution_557 {
    public static void main(String[] args) {
        Solution_557 solution557 = new Solution_557();

        String s = "Let's take LeetCode contest";
        System.out.println(solution557.reverseWords(s));

    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }
}
