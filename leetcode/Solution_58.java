package pdpuz;

public class Solution_58 {
    public static void main(String[] args) {
        Solution_58 sol1 = new Solution_58();

        String str = "   fly me   to   the moon  ";

        System.out.println(sol1.lengthOfLastWord(str));

    }

    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lastword = arr[arr.length - 1];
        int counter = 0;


        for (int i = 0; i < lastword.length(); i++) {
            char c = lastword.charAt(i);
            counter++;
        }

        System.out.println(lastword);

        return counter;
    }
}
