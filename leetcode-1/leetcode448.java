import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode448 {
    public static void main(String[] args) {
        int arr[] = {6,2,7,3,1,9,8};
        System.out.println(findDisappearedNumbers(arr));;


    }
    static  List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;

        while (i < nums.length){

            //correct position hogi 3 ki 2
            int correct = nums[i] -1 ;

            if ( nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> arr = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                arr.add(index+1);
            }

        }
        return arr;
    }
    static void swap(int[] arr,int start,int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}
