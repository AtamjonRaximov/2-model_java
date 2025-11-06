package pdpuz;

public class Solution_14 {
    public static void main(String[] args) {
        Solution_14 sol1 = new Solution_14();

        String[] arr = {"flower", "flow", "flight"};

        System.out.println(sol1.longestCommonPrefix(arr));

    }

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String perfix = strs[0];


        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(perfix) != 0) {
                perfix = perfix.substring(0, perfix.length() - 1);
                if (perfix.isEmpty()) return "";
            }
        }
        return perfix;

    }
}
