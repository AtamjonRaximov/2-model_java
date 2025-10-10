package pdpuz;


public class Solution_2390 {
        public static void main(String[] args) {
            Solution_2390 sol1 = new Solution_2390();
            String str = "leet**cod*e";
            System.out.println(sol1.removeStars(str));
        }

        public String removeStars(String s) {
            StringBuilder stack = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (ch == '*') {
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    stack.append(ch);
                }
            }
            return stack.toString();
        }
}
