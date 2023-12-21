import java.util.Arrays;
import java.util.Comparator;

public class leetcode1637 {
    public static void main(String[] args) {

        int[][] array = {{8,7},{9,9},{7,4},{9,7}};

        System.out.println(maxWidthOfVerticalArea(array));

    }
    static int maxWidthOfVerticalArea(int[][] points) {
        int maxDifference = 0;
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));
        for (int i = 1; i < points.length; i++) {

            if (points[i][0] - points[i - 1][0]  > maxDifference){
                maxDifference = points[i][0] - points[i - 1][0] ;
            }
        }
        return maxDifference;

    }
}
