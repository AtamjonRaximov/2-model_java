package pdpuz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution_599 {
    public static void main(String[] args) {
        Solution_599 solution599 = new Solution_599();

        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(solution599.findRestaurant(list1, list2)));

    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list2.length && i <= minSum; i++) {
            String w = list2[i];
            if (!map.containsKey(w)) continue;
            int sum = i + map.get(w);
            if (sum < minSum){
                minSum=sum;
                res.clear();
                res.add(w);
            } else if (sum == minSum) {
                res.add(w);
            }
        }
        return res.toArray(new String[0]);
    }
}
