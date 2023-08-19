import java.util.Arrays;

public class leetcode189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate_one(arr,3);
        System.out.println(Arrays.toString(arr));

    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate_one(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int count = 0;
        for (int start = 0; count < n; start++) {
            int current = start;
            int prevValue = nums[start];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prevValue;
                prevValue = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
    public static void rotate(int[] nums, int k) {
        // Step 1: Handle k
        k %= nums.length;

        // Step 2: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 3: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 4: Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }
}
