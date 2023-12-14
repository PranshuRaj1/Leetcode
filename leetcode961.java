import java.util.HashMap;
import java.util.Map;

public class leetcode961  {
    public static void main(String[] args) {
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(arr));

    }
    static int repeatedNTimes(int[] nums) {
        int len = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num :
                nums) {
            int count = 0;
            if (!map.containsKey(num)){
                count = count + 1;
                map.put(num,count);
            }
            else {
                int newCount = map.get(num) + 1;
                map.put(num,newCount);
            }
        }

        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if (entry.getValue().equals(len)){
                return entry.getKey();
            }
        }


        return -1;


    }
}
