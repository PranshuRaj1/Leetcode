import java.util.HashMap;
import java.util.Map;

public class leetcode2341_1 {
    public static void main(String[] args) {

    }
    static int[] numberOfPairs(int[] nums) {
        int[] visited = new int[101];
        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int pairCount = visited[value];
            pairCount++;
            visited[value] = pairCount;

            if (pairCount == 2){
                pairs++;
                visited[value] = 0;
            }
        }
        return new int[]{pairs, nums.length - (2*pairs)};

    }
}
