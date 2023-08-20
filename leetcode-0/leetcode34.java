import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
        int[] num = {5,7,7,8,8,10};
        int b = 1011;int a = 10;

        System.out.println(Arrays.toString(searchRange(num,8)));

    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        if (ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }
    static int search(int[] nums , int target, boolean findstartindex){
        int len = nums.length;
        int start = 0;
        int end = len - 1;

        int ans = -1;

        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid] > target){
                end = mid - 1;
            }

            else if(nums[mid] < target){
                start = mid + 1;

            }
            else {
                ans = mid;
                if (findstartindex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
