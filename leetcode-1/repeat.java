public class repeat {
    public static void main(String[] args) {
        int arr[] = {1,1};
        System.out.println(missing(arr));;


    }
    static int missing(int[] nums){
        int i = 0;
        while (i< nums.length){
            int correct = nums[i] - 1 ;//assuming arrays starts from 0
            if (nums.length > nums[i] && nums[correct]!=nums[i]){
                swap(nums,i,correct);

            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                return nums[j];
            }
        }
        return nums.length-1;
    }
    static void swap(int[] arr,int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
