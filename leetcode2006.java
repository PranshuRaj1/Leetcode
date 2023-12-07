import java.util.HashMap;

public class leetcode2006 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        System.out.println(countKDifference(nums,1));

    }
     static int countKDifference(int[] nums, int k) {
         HashMap<Integer,Integer> map = new HashMap<>();
         int count = 0;

         for (int num: nums) {
             count += map.getOrDefault(num - k,0);
             count += map.getOrDefault(num + k , 0);

             map.put(num,map.getOrDefault(num,0)+1);
         }

         return count;

    }
}
