import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {10,90,180,270,360};
//        insertion_sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(bs(arr,45));
        System.out.println(Arrays.toString(prefix(arr)));
    }
    static void bubble(int[] arr){
        int len = arr.length;
        boolean swapped;
        for (int i = 0; i < len; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }

    }
    static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int get_max(int[] arr, int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i]  > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void insertion_sort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len -1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
                else {
                    break;
                }

            }

        }
    }
    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return  -1;
    }
    static int[] prefix(int[] arr){
        int len = arr.length;
        int average = 0;
        int  num = 1;

        for (int i = 0; i < len; i++) {
            average = (arr[i] + average)/num;
            arr[i] = average;
            num++;
        }
        return arr;
    }

}
