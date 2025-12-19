package pdpuz;

public class Solution_383 {
    public static void main(String[] args) {
        Solution_383 solution383 = new Solution_383();

        String ransomNote = "a";
        String magazine = "b";
        System.out.println(solution383.canConstruct(ransomNote, magazine));

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c -'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if(count[c-'a']==0)return false;
            count[c-'a']--;

        }
        return true;
    }
}
