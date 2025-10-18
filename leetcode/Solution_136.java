package pdpuz;

public class Solution_136 {
    public static void main(String[] args) {
        int[] arr = {2, 8,2, 1,1,8};
        Solution_136 sol1 = new Solution_136();
        System.out.println(sol1.singleNumber(arr));

    }

    public int singleNumber(int[] nums) {
        int val = 0;

        for (int i = 0; i < nums.length; i++) {
            val = val ^ nums[i];
        }
        return val;

    }
}
