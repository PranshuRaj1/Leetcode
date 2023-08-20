import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode645 {
    public static void main(String[] args) {
        int arr[] = {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));;
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }

        }
        int count = 0;
        int arr1[] = {0,0};
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                arr1[count] = nums[index];
                arr1[count + 1] = index + 1;
                count = count + 2;


            }

        }
        return arr1;

    }
    static void swap(int[] arr, int start , int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }



}
