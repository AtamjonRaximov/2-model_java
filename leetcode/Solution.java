package pdpuz;

public class Solution {
    public static void main(String[] args) {
        Solution solution1 = new Solution();

        char[] arr={'h','e','e','l','o'};
        char[] s={'h','e','l','l','o'};


        solution1.reverseString(arr);
        System.out.println(arr);





    }
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }


    }


}
