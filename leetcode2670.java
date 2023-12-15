import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode2670 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4,2};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));

    }

    static int[] distinctDifferenceArray(int[] nums) {
        int len = nums.length;
        int[] distinct = new int[len];
        HashMap<Integer, Integer> prefix = new HashMap<>();
        HashMap<Integer, Integer> suffix = new HashMap<>();

        for (int x: nums) {
            suffix.put(x, suffix.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < len; i++) {
            int x = nums[i];
            prefix.put(x,prefix.getOrDefault(x,0)+1);
            suffix.put(x, suffix.get(x)-1);

            if (suffix.get(x) == 0){
                suffix.remove(x);
            }
            distinct[i] = prefix.size() - suffix.size();
        }

        return distinct;

    }
}
