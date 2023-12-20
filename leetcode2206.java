import java.util.Arrays;

public class leetcode2206 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(divideArray(arr));
    }
    static boolean divideArray(int[] nums) {
        boolean ans = true;
        if (nums.length %2 == 0){
            Arrays.sort(nums);

            for (int i = 1; i < nums.length; i+=2) {
                if (nums[i-1] == nums[i] && ans){
                    continue;
                }
                else {
                    ans =  false;
                }
            }
        }
        else {
            return false;
        }
        return ans;
    }
}
