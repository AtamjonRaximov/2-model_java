package pdpuz;

public class Solution_485 {
    public static void main(String[] args) {
        Solution_485 solution485 = new Solution_485();

        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(solution485.findMaxConsecutiveOnes(nums));

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max_count) max_count = count;
            } else count = 0;

        }
        return max_count;
    }
}
