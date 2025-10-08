package pdpuz;


public class Solution_3174 {
    public static void main(String[] args) {
        String str = "ab9o0c";
        Solution_3174 sol1 = new Solution_3174();
        System.out.println(sol1.clearDigits(str));

    }

    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();

    }
}
