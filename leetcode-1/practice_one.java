import java.util.Arrays;

public class practice_one {
    public static void main(String[] args) {
        int arr[] = {6,2,7,3,1,9,8,5,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicsort(int[] arr){
        int i = 0;


        while (i < arr.length) {
            int correctIndex = arr[i] -1 ; // Assuming elements start from 1
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int start,int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}
