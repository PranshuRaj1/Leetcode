import java.util.Arrays;

public class leetcode167 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        System.out.println(Arrays.toString(twoSum(arr,-1)));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int start = 0;
        int end = len - 1;
        while (start < end){
            int correct_sum = numbers[start] + numbers[end];

            if (correct_sum == target){
                return new int[]{start + 1, end + 1};
            }
            else if (correct_sum < target){
                start++;
            }
            else {
                end--;
            }
        }
        return new int[]{};

    }
}
