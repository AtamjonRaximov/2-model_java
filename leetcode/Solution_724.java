package pdpuz;

public class Solution_724 {
    public static void main(String[] args) {
        Solution_724 solution724 = new Solution_724();

        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(solution724.pivotIndex(nums));

    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int presum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (presum == sum - nums[i] - presum) {
                return i;
            }
            presum += nums[i];
        }
        return -1;

    }
}
