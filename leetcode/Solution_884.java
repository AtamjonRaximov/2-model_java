package pdpuz;

import java.util.*;


public class Solution_884 {
    public static void main(String[] args) {
        Solution_884 sol1 = new Solution_884();
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        System.out.println(Arrays.toString(sol1.uncommonFromSentences(s1, s2)));

    }

    public String[] uncommonFromSentences(String s1, String s2) {
        String s = s1 + " " + s2;

        String[] words = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        List<String> list = new ArrayList<>();
        int index = 0;
        while (index < words.length) {
            if (map.get(words[index]) == 1) {
                list.add(words[index]);
            }
            index++;
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }


        return result;
    }
}
