import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode59 {
    public static void main(String[] args) {
        int[][] matrix = spiralOrder1(3);
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Print the matrix
        System.out.println("2D Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }




    static int[][] spiralOrder1(int n) {



        int[][] matrix = new int[n][n];
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;
        int count = 1;


        while (top <= bottom && left <=right){
            //right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count;
                count++;
            }
            top++;

            //top to bottom

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;

            }
            right--;

            if (top <= bottom){
                for (int i = right; i >= left ; i--) {
                    matrix[bottom][i] = count;
                    count++;

                }
            }
            bottom--;

            if (left<= right){
                for (int i = bottom; i >=top ; i--) {
                    matrix[i][left] = count;
                    count++;

                }
            }
            left++;
        }
        return matrix;

    }
}
