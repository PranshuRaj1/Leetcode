import java.util.Arrays;
import java.util.HashMap;

public class leetcode2870 {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations1(nums));


    }
    static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int ans = 0;

        while (start < nums.length){
            int check = start;
            while (check < nums.length && nums[check] == nums[start]){
                check++;
            }
            int count = check - start;

            if (count == 1){
                return  - 1;
            }
            ans = ans +  count / 3;
            if (count % 3 != 0){
                ans++;
            }
            start = check;

        }
        return ans;

    }
    static int minOperations1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for (int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for (int val: map.values()) {
            if (val == 1){
                return -1;
            }
            ans = ans + val /3;

            if (val % 3 != 0){
                ans++;
            }
        }
        return ans;

    }
}
