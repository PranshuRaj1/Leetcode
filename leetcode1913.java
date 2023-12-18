import java.util.Arrays;

public class leetcode1913 {
    public static void main(String[] args) {
        int[] arr = {5,6,2,7,4};
        System.out.println(maxProductDifference(arr));

    }
    static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1]*nums[nums.length - 2] - nums[1]*nums[0];
    }
}
