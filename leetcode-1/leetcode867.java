import java.util.Arrays;

public class leetcode867 {
    public static void main(String[] args) {
        int[][] matix = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(Arrays.deepToString(transpose(matix)));

    }
    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                ans[j][i] = matrix[i][j];

        return ans;

    }
    static void swap(int[] arr,int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }


}
