import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{8,9,4},{7,6,5}
        };
        int[][] arr1 = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };
        int[][] arr2 = {{2,3}};
        System.out.println(spiralOrder(arr));
//        System.out.println(spiralOrder(arr1));
//        System.out.println(spiralOrder(arr2));



    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();


        //1,2,3,6,9,8,7,4,5

        //maximum of row is fixed
//        int row = 0;
//
//        int len = matrix[row].length;
//        if (len == 1){
//            list.add(matrix[0][0]);
//            return list;
//        }
//        if (matrix.length == 1){
//            for (int i = 0; i < matrix[row].length; i++) {
//                list.add(matrix[row][i]);
//            }
//            return list;
//        }
//
//        for (int i = 0; i < len; i++) {
//            list.add(matrix[row][i]);
//
//        }
//        row = row + 1;
//        list.add(matrix[row][matrix[row].length-1]);
//
//        row = row + 1;
//        for (int i = matrix[row].length - 1; i >= 0 ; i--) {
//            list.add(matrix[row][i]);
//
//        }
//        row = row - 1;
//        for (int i = 0; i < matrix[row].length - 1; i++) {
//            list.add(matrix[row][i]);
//
//        }
//
//
        //right to bottom to left to top


        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;


        while (top <= bottom && left <=right){
            //right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //top to bottom

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);

            }
            right--;

            if (top <= bottom){
                for (int i = right; i >= left ; i--) {
                    list.add(matrix[bottom][i]);

                }
            }
            bottom--;

            if (left<= right){
                for (int i = bottom; i >=top ; i--) {
                    list.add(matrix[i][left]);

                }
            }
            left++;
        }
        return list;

    }
}
