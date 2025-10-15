package pdpuz;

import com.sun.jdi.Value;

import java.util.HashMap;

public class Solution_13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        Solution_13 sol1 = new Solution_13();
        System.out.println(sol1.romanToInt(s));
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))) {
                result = result - hm.get(s.charAt(i));
            } else {
                result = result + hm.get(s.charAt(i));
            }

        }
        return result;

    }
}
