import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class leetcode2418 {
    public static void main(String[] args) {
        int[] height = {180,165,170};
        String[] names = {"Mary","Emma","John"};
        System.out.println(Arrays.toString(sortPeople(names, height)));

    }
    static String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
            System.out.println(map);
        }
        System.out.println("End");
        System.out.println("map"+ map);
        int size = heights.length - 1;

        for (Map.Entry<Integer, String> set : map.entrySet()) {
            System.out.println("For each :- " + set);
            result[size] = set.getValue();
            System.out.println("Result" + Arrays.toString(result));
            size--;
        }
        System.out.println("EntrySet" + map.entrySet());

        return result;

    }
}
