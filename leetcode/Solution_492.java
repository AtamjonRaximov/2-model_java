package pdpuz;

import java.util.Arrays;

public class Solution_492 {
    public static void main(String[] args) {
        Solution_492 solution492 = new Solution_492();

        int area = 4;
        System.out.println(Arrays.toString(solution492.constructRectangle(area)));

    }

    public int[] constructRectangle(int area) {
        int startPoint = (int) Math.sqrt(area);

        for (int i = startPoint; i >= 1; i--) {
            if (area % i == 0) {
                return new int[]{area / i, i};
            }
        }
        return new int[]{area, 1};
    }
}
