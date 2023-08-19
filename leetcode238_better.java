import java.util.Arrays;

public class leetcode238_better {
    public static void main(String[] args) {
        int[] num = {-1,1,0,-3,3};
        int[] num1 = {1,2,3,4};
        int[] num2 = {1,0,23,0};
        int[] num3 = {0};
        int[] num4 = {9};
        int[] num5 = {0,8,1};
        int[] num6 = {0,9};
        int[] num7 = {0,0,0};

        System.out.println(Arrays.toString(productExceptSelf(num7)));




        System.out.println(Arrays.toString(productExceptSelf(num)));
        System.out.println(Arrays.toString(productExceptSelf(num1)));
        System.out.println(Arrays.toString(productExceptSelf(num2)));
        System.out.println(Arrays.toString(productExceptSelf(num3)));
        System.out.println(Arrays.toString(productExceptSelf(num4)));
        System.out.println(Arrays.toString(productExceptSelf(num5)));
        System.out.println(Arrays.toString(productExceptSelf(num6)));

    }
    static int[] productExceptSelf(int[] nums) {
//        int len = nums.length;
//        int[] answer = new int[len];
//
//        for (int i = 0; i < len; i++) {
//            int product = 1;
//            for (int j = 0; j < len; j++) {
//                if (i == j){
//                    continue;
//                }
//                product = product * nums[j];
//            }
//            answer[i] = product;
//        }
//        return answer;
//
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;

    }
}
