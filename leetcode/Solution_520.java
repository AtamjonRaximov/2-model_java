package pdpuz;

public class Solution_520 {
    public static void main(String[] args) {
        Solution_520 solution520 = new Solution_520();

        String word = "USA";
        System.out.println(solution520.detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                (Character.isUpperCase(word.charAt(0)) &&
                        word.substring(1).equals(word.substring(1).toLowerCase()));

    }
}
