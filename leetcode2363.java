import java.util.*;

public class leetcode2363 {
    public static void main(String[] args) {
        int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][] items2 = {{3,1},{1,5}};
        System.out.println(mergeSimilarItems(items1,items2));

    }

    static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] it : items1) {
            map.merge(it[0], it[1], Integer::sum);
        }
        for (int[] it : items2) {
            map.merge(it[0], it[1], Integer::sum);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            ans.add(Arrays.asList(e.getKey(), e.getValue()));
        }


        return ans;


    }
}
