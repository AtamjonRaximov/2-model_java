package pdpuz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution_88 {
    public static void main(String[] args) {
        Solution_88 sol1 = new Solution_88();
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        sol1.merge(arr1, m, arr2, n);


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        System.out.println(Arrays.toString(nums1));


    }
}
