public class leetcode53 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }
    static int maxSubArray(int[] nums) {
        //kadane algo
        int len = nums.length;
        if (len == 1){
            return nums[0];
        }
        int sum  = nums[0];
        int current_sum = nums[0];
        for (int i = 1; i < len; i++) {
            current_sum = Math.max(current_sum + nums[i],nums[i]);
            sum = Math.max(sum,current_sum);

        }
        return sum;


    }
}
