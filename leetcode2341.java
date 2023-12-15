import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode2341 {
    public static void main(String[] args) {
        int[] arr= {0};
        System.out.println(Arrays.toString(numberOfPairs(arr)));

    }
    static int[] numberOfPairs(int[] nums) {
        int numberOfPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.values()) {
            numberOfPairs += (num / 2);
        }


        return new int[] {numberOfPairs,nums.length - 2 * numberOfPairs };


    }
}
