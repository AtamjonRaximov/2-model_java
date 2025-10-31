package pdpuz;


public class Solution_345 {
    public static void main(String[] args) {
        Solution_345 sol1 = new Solution_345();
        String str = "IceCreAm";

        System.out.println(sol1.reverseVowels(str));

    }

    public String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isvowel(ch[start])) {
                start++;
            } else if (!isvowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);

    }

    public static boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'O' || ch == 'E' || ch == 'I' || ch == 'U') {
            return true;
        }
        return false;
    }
}
