import java.util.ArrayList;
import java.util.List;

public class leetcode969 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        System.out.println(pancakeSort(arr));

    }
    static List<Integer> pancakeSort(int[] arr) {
        int len = arr.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = len - 1; i > 0 ; i--) {
            int index = min(arr,i);

            if (index != 0){
                swap(arr,index + 1);
                ans.add(index + 1);

                swap(arr, i + 1);
                ans.add(i + 1);
            }
        }

        return ans;

    }
    static void swap(int[] arr, int k ){
        int start = 0;
        int end = k - 1;  // Adjust for 1-based indexing
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int min(int[] arr, int last ){

        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i <= last; i++) {
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
