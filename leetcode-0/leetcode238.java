import java.util.Arrays;

public class leetcode238 {
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
        int len = nums.length;
        int[] answer = new int[len];
        int count = 0;
        int index = 0;
        if (len == 1){
            answer[0] = nums[0];
            return answer;
        }

        for (int i = 0; i < len; i++) {

            if (nums[i] == 0){
                index = i;
                count++;
            }
        }

        if (count >= 2){
            return answer;
        }

        if (count == 1){
            int product = 1;
            for (int i = 0; i < len; i++) {
                if (i != index){
                    product = product * nums[i];

                }
                answer[index] = product;
            }
            return answer;


        }
        else {

            for (int i = 0; i < len; i++) {
                int product = 1;
                for (int j = 0; j < len; j++) {
                    product = product * nums[j];

                }
                answer[i] = product/ nums[i];

            }
        }




        return answer;

    }
}
