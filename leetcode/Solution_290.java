package pdpuz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_290 {
    public static void main(String[] args) {
        Solution_290 solution = new Solution_290();

        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(solution.wordPattern(pattern, s));

    }

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (used.contains(w)) {
                if (!map.containsKey(c)) return false;
            } else {
                if (used.contains(w)) return false;
                map.put(c, w);
                used.add(w);
            }
        }
        return true;

    }
}
