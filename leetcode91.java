import java.util.Arrays;

public class leetcode91 {
    public static void main(String[] args) {
        System.out.println(numDecodings("606"));

    }

    static int numDecodings(String s) {
        if (s.charAt(0) == '0'){
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            int OneDigit = s.charAt(i - 1) - '0';
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));

            if (OneDigit != 0){
                dp[i] += dp[i-1];
            }
            if (10 <= twoDigit && twoDigit <= 26){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
    }
}