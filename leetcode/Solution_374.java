package pdpuz;

public class Solution_374  {
    public static int pick = 6;
    public static int guess(int num){
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;

    }

    public static void main(String[] args) {
        Solution_374 solution374 = new Solution_374();

        int n = 10;
        System.out.println(solution374.guessNumber(n));

    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) return mid;
            if (guess(mid) == 1) start = mid + 1;
            else end = mid - 1;

        }
        return -1;
    }
}
