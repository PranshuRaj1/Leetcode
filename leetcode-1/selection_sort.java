import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,-55,0,33,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i -1;
            int maxIndex = getmax(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    static void swap(int[] arr,int start,int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

    static int getmax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }

        }
        return max;
    }
}
