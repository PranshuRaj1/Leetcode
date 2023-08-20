public class leetcode1250 {
    public static void main(String[] args) {

    }
    static boolean isGoodArray(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false; // If the total sum is odd, we can't obtain a sum of 1.
        }

        int targetSum = sum / 2;
        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int currentSum = targetSum; currentSum >= num; currentSum--) {
                dp[currentSum] = dp[currentSum] || dp[currentSum - num];
            }
        }

        return dp[targetSum];

    }
}
