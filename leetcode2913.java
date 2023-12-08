import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode2913 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        System.out.println(sumCounts(l));

    }
    static int sumCounts(List<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                int a = i;
                while (a <= j){
                    map.put(nums.get(a),0);
                    a++;
                }

                sum += map.size() * map.size();

                System.out.println(map);
                map.clear();
            }
        }

        return sum;
    }
}
