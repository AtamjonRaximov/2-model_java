package pdpuz;

public class Solution3541 {
    public static void main(String[] args) {
        String s = "successes";
        Solution3541 sol1 = new Solution3541();
        System.out.println(sol1.maxFreqSum(s));

    }

    public int maxFreqSum(String s) {
        int[] frenq1 = new int[26];
        int[] frenq2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o') {
                frenq1[ch - 'a']++;
            } else {
                frenq2[ch - 'a']++;
            }

        }
        int max1 = 0;int max2 = 0;
        for (int i = 0; i < 26; i++) {
            max1 = Math.max(frenq1[i], max1);
            max2 = Math.max(frenq2[i], max2);
        }
        return max1+max2;


    }
}
