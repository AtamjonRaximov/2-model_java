package pdpuz;

import java.util.HashMap;
import java.util.Map;

public class Solution_605 {
    public static void main(String[] args) {
        Solution_605 solution605 = new Solution_605();

        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(solution605.canPlaceFlowers(flowerbed, n));

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < flowerbed.length; i++) {
            map.put(flowerbed[i],i);
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.containsKey(n)) return true;
        }
        return false;

    }
}
