package pdpuz;

public class Solution_20 {
    public static void main(String[] args) {
        String s = "()";
        Solution_20 s1 = new Solution_20();
        System.out.println(s1.isValid(s));

    }

    public boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else {
                return s.isEmpty();
            }
        }

    }
}
