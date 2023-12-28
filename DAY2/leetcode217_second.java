package DAY2;

import java.util.Arrays;

class leetcode217_second {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 1; i <len; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}