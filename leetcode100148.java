import java.util.Arrays;

public class leetcode100148 {
    public static void main(String[] args) {
        int[] arr = {2,5};
        System.out.println(Arrays.toString(numberGame(arr)));

    }
    static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i+=2) {
            arr[i-1] = nums[i];
            arr[i] = nums[i-1];
        }

        return arr;

    }
}
