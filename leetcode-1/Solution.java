class Solution {
    public static void main(String[] args) {
        int arr[] = {6,2,7,3,1,9,8,0};
        System.out.println(missingNumber(arr));


    }
    static int missingNumber(int[] nums) {
        int arr[] = {};
        int i = 0;

        while (i < nums.length){

            //correct position hogi 3 ki 2
            int correct = nums[i] ;

            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr,int start,int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

}