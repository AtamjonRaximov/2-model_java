package pdpuz;

public class Solution3110 {
    public static void main(String[] args) {
        Solution3110 solition1 =new Solution3110();
        System.out.println(solition1.scoreOfString("hello"));

    }
    public int scoreOfString(String s) {
        char[] c =s.toCharArray();
        int sum=0;

        for (int i = 0; i < s.length()-1; i++) {
            sum+=Math.abs(c[i]-c[i+1]);

        }
        return sum;

    }

}
