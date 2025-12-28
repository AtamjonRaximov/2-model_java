package pdpuz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_448 {
    public static void main(String[] args) {
        Solution_448 solution448 = new Solution_448();

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(solution448.findDisappearedNumbers(arr));

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> newArray = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            newArray.add(nums[i]);
        }
        for (int i = 1; i <= nums.length ; i++) {
            if (!newArray.contains(i)){
                result.add(i);
            }

        }

        System.out.println(newArray.contains(5));

        System.out.println(newArray);
        return result;
    }
}
