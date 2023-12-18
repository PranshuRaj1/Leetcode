import java.util.Arrays;

public class leetcode2968 {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4};
        System.out.println(maxFrequencyScore(arr,3));

    }
    static int maxFrequencyScore(int[] nums, long k) {
        Arrays.sort(nums);
        long sum[] = new long[nums.length + 1], max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = nums[i] + sum[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int left = i, right = nums.length - 1;
            while (left < right) {
                int mid = (left + right + 1) / 2, x = (i + mid) / 2;
                if ((x - i) * nums[x] - sum[x] + sum[i] + sum[mid + 1] - sum[x + 1] - (mid - x) * nums[x] <= k) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
            max = Math.max(max, left - i + 1);
        }
        return (int) max;


    }
}
