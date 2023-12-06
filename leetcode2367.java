import java.util.HashSet;

public class leetcode2367 {
    public static void main(String[] args) {
        int[] arr = {0,1,4,6,7,10};
        int diff =2;
        System.out.println(arithmeticTriplets(arr,diff));

    }
    static int arithmeticTriplets(int[] nums, int diff) {
        if (nums.length < 3){
            return 0;
        }
        int count = 0;
        HashSet<Integer> ans = new HashSet<>();
        for (int num: nums) {
            if(ans.contains(num - diff) && ans.contains((num - diff*2))){
                count++;
            }
            ans.add(num);
        }
        return  count;

    }
}
