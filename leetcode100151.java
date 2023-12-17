import java.util.Arrays;

public class leetcode100151 {
    public static void main(String[] args) {
        int[] nums  = {10,12,13,14,15};
        System.out.println(minimumCost(nums));

    }
    static long minimumCost(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        long mid = nums[len/2];
        long ans = 0;
        long num = Long.MAX_VALUE;

        long c1 = mid;
        long c2 = mid;

        for (long c : new long[]{c1, c2}) {
            long tyt = 0;
            for (int i = 0; i < len; i++) {
                tyt = tyt + Math.abs(nums[i] - c);
            }
            ans = Math.min(num,tyt);

        }


        return ans;
    }

}
