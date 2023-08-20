import java.util.ArrayList;
import java.util.List;

public class leetcode1380 {
    public static void main(String[] args) {
        int arr[][] = {{3,7,8},
                       {9,11,13},
                       {15,16,17}};
        System.out.println(luckyNumbers(arr));

    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        int len = matrix.length;
        List<Integer> lucky = new ArrayList<>();
        for (int row = 0; row < len; row++) {
            int index = 0;
            int row_min = Integer.MAX_VALUE;
            for (int column = 0; column <matrix[row].length ; column++) {
                if (matrix[row][column] < row_min) {
                    row_min = matrix[row][column];
                    index = column;
                }
            }
                boolean ans = true;
                for (int colum = 0; colum < matrix.length; colum++) {
                    if (matrix[row][index] < matrix[colum][index]){
                        ans = false;
                        break;

                    }
                }
                if (ans){
                    lucky.add(matrix[row][index]);
                }
            }

        return lucky;
    }
}
