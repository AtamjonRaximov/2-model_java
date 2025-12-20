package pdpuz;


public class Solution_387 {
    public static void main(String[] args) {
        Solution_387 solution387 = new Solution_387();

        String s = "loveleetcode";
        System.out.println(solution387.firstUniqChar(s));

    }

    public int firstUniqChar(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (arr[index] == 1) return i;
        }
        return -1;
    }
}
