public class leetcode198 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {2,7,9,3,1};
        System.out.println(rob(arr1));
        System.out.println(rob(arr2));

    }
    static int rob(int[] nums) {
        int len = nums.length;

        if (len == 0){
            return 0;
        }

        if (len == 1){
            return nums[0];
        }

        if (len == 2){
            return Math.max(nums[0],nums[1]);
        }

        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);

        for (int i = 2; i < len; i++) {
            int current = Math.max(nums[i] + first, second);
            first = second;
            second = current;
        }
        return second;

    }

}
