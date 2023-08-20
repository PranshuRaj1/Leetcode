public class leetcode1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));

    }
    public static int findKthPositive(int[] arr, int k) {
        int missingcount = 0;
        int missingNumber = 1;
        int i = 0;

        while(missingcount < k){
            if (i < arr.length && arr[i] == missingNumber){
                i++;
            }
            else {
                missingcount++;
            }
            missingNumber++;
        }
        return missingNumber - 1;
    }

}
