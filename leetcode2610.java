import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode2610 {
    public static void main(String[] args) {

    }
    List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        //make an array
        int[] freq = new int[nums.length + 1];


        //iterate through the array and check if the element is unique or not
        for (int num : nums) {
            if (freq[num] >= list.size()){
                list.add(new ArrayList<>());
            }
            list.get(freq[num]).add(num);
            freq[num]++;
        }
        return list;
    }
}
