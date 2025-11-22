package pdpuz;

public class Solution_121 {
    public static void main(String[] args) {
        Solution_121 solution121 = new Solution_121();

        int[] arr = {7,6,4,3,1};

        System.out.println(solution121.maxProfit(arr));

    }

    public int maxProfit(int[] prices) {
        int max_val = 0;
        int buy_price = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int curr = prices[i] - buy_price;
            if (curr > max_val) {
                max_val = curr;
            }
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
        }
        return max_val;
    }
}
