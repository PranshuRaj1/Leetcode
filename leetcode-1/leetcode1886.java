import java.util.Arrays;

public class leetcode1886 {
    public static void main(String[] args) {
        int[][] arr= {{1}};
        int[][] target = {{1}};

//        System.out.println(Arrays.deepToString(arr));
       System.out.println(findRotation(arr,target));

    }
    static void rotate(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int start = 0;
        int end = matrix.length - 1;
        while (start<=end){
            for (int i = 0; i < n; i++) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
            start++;
            end--;
        }
    }
    static boolean check(int[][] matrix, int[][] target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i <4 ; i++) {
            if (check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;


    }
}
