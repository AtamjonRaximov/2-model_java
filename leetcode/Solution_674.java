package pdpuz;

public class Solution_674 {
    public static void main(String[] args) {
        Solution_674 solution674 = new Solution_674();

        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(solution674.findLengthOfLCIS(nums));

    }

    public int findLengthOfLCIS(int[] nums) {
        int i = 0, j = i + 1, maxNum = 1;
        while (j < nums.length) {
            while (j < nums.length && nums[j] > nums[j - 1]) {
                maxNum = Math.max(j - i + 1, maxNum);
                j++;
            }
            i = j;
            j++;
        }
        return maxNum;
    }
}
