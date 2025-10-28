package pdpuz;

import java.util.HashMap;

public class Solution_217 {
    public static void main(String[] args) {
        Solution_217 sol1 = new Solution_217();
        int[] arr = {1, 2, 3, 4};

        System.out.println(sol1.containsDuplicate(arr));


    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }


}
