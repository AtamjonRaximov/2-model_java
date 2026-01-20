package pdpuz;

import java.util.Arrays;

public class Solution_566 {
    public static void main(String[] args) {
        Solution_566 solution566 = new Solution_566();

        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        System.out.println(Arrays.deepToString(solution566.matrixReshape(mat, r, c)));

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == 0 || mat.length * mat[0].length != r * c) return mat;

        int a = 0,
                b = 0;

        int[][] res = new int[r][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[a][b++] = mat[i][j];
                if (b == c) {
                    a++;
                    b = 0;
                }
            }
        }
        return res;
    }
}
