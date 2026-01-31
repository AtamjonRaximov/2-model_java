package pdpuz;

public class Solution_657 {
    public static void main(String[] args) {
        Solution_657 solution657 = new Solution_657();

        String moves = "RLUURDDDLU";
        System.out.println(solution657.judgeCircle(moves));

    }

    public boolean judgeCircle(String moves) {
        int updown = 0,
                left = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'U') updown++;
            else if (c == 'D') updown--;
            else if (c == 'L') left--;
            else if (c == 'R') left++;
        }

        return updown == 0 && left == 0;

    }


}
