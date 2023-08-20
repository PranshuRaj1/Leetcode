import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void cyclicsort(int[] arr){
        int i = 0;

        while (i < arr.length){
            int correct = arr[i] -1;
            //correct position hogi 3 ki 2

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
