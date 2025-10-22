package pdpuz;

import java.util.HashMap;

public class Solution_28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        Solution_28 sol1 = new Solution_28();
        System.out.println(sol1.strStr(haystack, needle));

    }

    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
