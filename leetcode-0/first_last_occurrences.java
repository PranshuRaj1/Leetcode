import java.util.Arrays;

public class first_last_occurrences {
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,13,14,20,20,20,20,20,30,40};
        System.out.println(Arrays.toString(first_last(arr,20)));


    }
    static int[] first_last(int[] arr , int target){
        int lb = lower_b(arr,target);
        if (lb == arr.length || arr[lb] != target){
            return new int[]{-1,-1};
        }
        else {
            return new int[]{lb, upper_bound(arr, target)-1};
        }
    }
    static int lower_b(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return  ans;
    }
    static int upper_bound(int[] arr ,int target){
        int len = arr.length;
        int start = 0;
        int end = len -1;
        int ans = -1;
        while (start <= end){
            int mid  = start + (end - start)/2;

            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
