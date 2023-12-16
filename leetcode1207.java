import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class leetcode1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int value :
                map.keySet()) {
            if (set.contains(map.get(value))){
                return false;
            }
            else {
                set.add(map.get(value));
            }
        }


        return true;


    }

}
