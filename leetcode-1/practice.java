import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int arr[] = {6,2,7,3,1,9,8,5,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicsort(int[] arr){
       int i  = 0 ;
       while (i< arr.length){
           int correct = arr[i] - 1;
           if (arr[i] != arr[correct]){
               swap(arr,i,correct);
           }
           else {
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
