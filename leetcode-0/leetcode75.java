import java.util.Arrays;

public class leetcode75 {
    public static void main(String[] args) {
        int[] nums  = {2,0,2,1,1,0};
//        sortColors(nums);
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void selectionSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min_index = len - i - 1;
            int max_index  = getmax(arr,0 ,min_index);
            swap(arr,max_index, min_index);
        }
    }

    private static int getmax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void sortColors(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1 ; j++) {
                if (nums[j] > nums[j+1]){
                    swap(nums, j , j +1);

                }
            }

        }

    }
    static void swap(int[] arr , int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
