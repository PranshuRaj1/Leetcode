import java.util.Arrays;

public class practice_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 10, 6};

        System.out.println("Original array: " + Arrays.toString(arr));
        bubble_sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
    static void swap(int[] arr , int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }

    static int getmax(int[] arr , int start , int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[i] > arr[max] ){
                max = i;
            }
        }
        return max;
    }
    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length - i - 1;
            int max_index = getmax(arr,0 , last_index);
            swap(arr,max_index,last_index);
        }
    }

    static void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] > arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void bubble_sort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j <arr.length - i ; j++) {
                if (arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

}
