import java.util.ArrayList;
import java.util.List;

public class Solution_728 {
    public static void main(String[] args) {
        Solution_728 solution728 = new Solution_728();

        int left = 1;
        int right = 22;
        System.out.println(solution728.selfDividingNumbers(left, right));

    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (valid(i)) result.add(i);
        }
        return result;
    }

    private boolean valid(int num) {
        int temp = num;

        while (num != 0) {
            int digit = num % 10;
            if (digit == 0 || temp % digit != 0) return false;
            num /= 10;
        }
        return true;
    }
}
