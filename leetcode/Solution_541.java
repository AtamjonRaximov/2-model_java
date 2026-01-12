package pdpuz;

public class Solution_541 {
    public static void main(String[] args) {
        Solution_541 solution541 = new Solution_541();

        String s = "abcdefg";
        int k = 2;
        System.out.println(solution541.reverseStr(s, k));

    }

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);

    }
}
