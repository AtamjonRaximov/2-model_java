package pdpuz;

import java.util.HashMap;
import java.util.Map;

public class Solution_205 {
    public static void main(String[] args) {
        Solution_205 solution205 = new Solution_205();

        String s = "egg";
        String t = "add";

        System.out.println(solution205.isIsomorphic(s, t));

    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapTS.containsKey(a)) {
                if (mapTS.get(a) != b) return false;
            } else mapTS.put(a, b);

            if (mapST.containsKey(b)) {
                if (mapST.get(b) != a) return false;
            } else mapST.put(b, a);

        }
        return true;
    }
}
