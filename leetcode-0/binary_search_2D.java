import java.util.Arrays;

public class binary_search_2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        int target = 11;
        System.out.println(Arrays.toString(bs(matrix,target)));
    }
    static  int[] bs(int[][] arr, int target){
        int row = 0;
        int column = arr.length -1;

        while (row < arr.length && column >= 0){
            if (arr[row][column] == target){
                return new  int[]{row,column};
            } else if (arr[row][column] < target) {
                row++;
            }
            else {
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
