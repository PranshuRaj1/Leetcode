import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode100161 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,7,9,3,5,1};
        System.out.println(Arrays.deepToString(divideArray(arr, 2)));

    }
    static int[][] divideArray(int[] nums, int k) {
        int a = nums.length;
        Arrays.sort(nums);
        int[][] answer = new int[a/3][3];

        for (int i = 0,row = 0; i < a; i+=3,row++) {
            if (nums[i+2] - nums[i] > k){
                return new int[][]{};

            }
            else {
                answer[row][0] = nums[i];
                answer[row][1] = nums[i + 1];
                answer[row][2] = nums[i + 2];

            }
        }
        return answer;

    }
}
