import java.util.Arrays;
import java.util.HashSet;

public class leetcode100149 {
    public static void main(String[] args) {
        int[][] arr = {{9,1,7},{8,9,2},{3,4,6}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));

    }
    static  int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        HashSet<Integer> set = new HashSet<>();
        int[] answer = new  int[2];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                }
                else {
                    answer[0] = grid[i][j];

                }
            }
        }

        for (int i = 1; i <= Math.pow(len,2); i++) {
            if (!set.contains(i)){
                answer[1] = i;
                break;
            }
        }
        return answer;

    }
}
