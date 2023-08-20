public class found_missing {
    public static void main(String[] args) {
        int arr[] = {6,2,7,3,1,9,8,4};
        System.out.println(missing(arr));;


    }
    static int missing(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i] - 1 ;//assuming arrays starts from 0
            if (arr.length > arr[i] && arr[correct]!=arr[i]){
                swap(arr,i,correct);

            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1){
                return j +1 ;
            }
        }
        return arr.length-1;
    }
    static void swap(int[] arr,int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
