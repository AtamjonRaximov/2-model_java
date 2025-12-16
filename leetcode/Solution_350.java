package pdpuz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution_350 {
    public static void main(String[] args) {
        Solution_350 solution350 = new Solution_350();

        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        System.out.println(Arrays.toString(solution350.intersect(num1, num2)));

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (hashMap.containsKey(num) && hashMap.get(num) >0){
                list.add(num);
                hashMap.put(num,hashMap.get(num)-1);
            }
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size() ; i++) {
            result[i]= list.get(i);
        }


        return result;
    }
}
