public class leetcode35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,2));

    }
    public static int searchInsert(int[] nums, int target){
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        
        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] == target){
                return  mid;
            }
            else if (nums[len -1] < target) {
                return len;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
