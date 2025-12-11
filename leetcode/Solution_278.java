package pdpuz;

public class Solution_278 {
    private static int badVersion = 4;
    public static boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public static void main(String[] args) {
        Solution_278 solution278 = new Solution_278();

        int n = 2;
        System.out.println(solution278.firstBadVersion(n));

    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
