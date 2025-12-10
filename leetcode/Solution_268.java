package pdpuz;


public class Solution_268 {
    public static void main(String[] args) {
        Solution_268 solution268 = new Solution_268();

        int[] nums = { 9,6,4,2,3,5,7,0,1};
        System.out.println(solution268.missingNumber(nums));

    }

    public int missingNumber(int[] nums) {
        int max = nums[0];
        int length = nums.length;
        int missing = 0;
        int sum = 0;


        for (int i = 0; i < length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int i = 0; i <= length; i++) {
            sum+=i;;
        }
        for (int i = 0; i < length; i++) {
            missing+=nums[i];
        }

        return sum-missing;
    }
}
