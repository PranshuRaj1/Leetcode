import java.util.Arrays;

public class left_right_sum2574 {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));

    }
    static int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        int[] answer = new int[len];
        leftSum[0] = 0;
        rightSum[len-1] = 0;
        for (int i = 1; i < len; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
            rightSum[-i-1] = rightSum[-i] + nums[-i+1];


        }

        for (int i = 0; i < len; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;

    }
}
