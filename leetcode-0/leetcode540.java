public class leetcode540 {
    public static void main(String[] args) {
        int[] arr= {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));

    }
    static int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        // if the elements are same they should hold index in sequence odd and even
        int start = 0;
        int end = len - 1;
        if (len == 1){
            return nums[0];
        }
        while (start < end){
            int mid  = start + (end - start)/2;
//            if (mid % 2 == 0){
//                //even
//                if ( nums[mid] == nums[mid + 1]){
//                    start = mid + 2;
//                }
//                else {
//                    end = mid;
//                }
//            }
//            else {
//                if ( nums[mid] == nums[mid - 1]){
//                    start = mid + 1;
//                }
//                else {
//                    end = mid - 1;
            if (mid % 2 == 1){
                mid --;
            }
            if(nums[mid] == nums[mid + 1]){
                start = mid + 2;
            }
            else {
                end = mid;
            }


        }
        return nums[start];

    }
}
