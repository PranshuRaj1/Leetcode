import java.util.Arrays;

public class leetcode66 {
    public static void main(String[] args) {
        int[] digits = { 9,9,0}; // Example input: [1, 2, 9]
        int[] result = plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));

    }
    static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len-1; i >=0 ; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }


        }
        int[] ans = new int[len+1];
        ans[0] = 1;
        return ans;

    }
}