package pdpuz;

import java.util.ArrayList;
import java.util.List;

public class Solution_66 {
    public static void main(String[] args) {
        int[] digits = {1,2,3,4};
        Solution_66 sol1 = new Solution_66();
        ;
        sol1.printArray(sol1.plusOne(digits));

    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }

    public void printArray(int[] digits) {

        System.out.print("[");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
