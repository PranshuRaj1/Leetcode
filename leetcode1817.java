import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode1817 {
    public static void main(String[] args) {
        int[][] arr = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        System.out.println(Arrays.toString(findingUsersActiveMinutes(arr, 5)));

    }
    static int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] answer = new int[k];
        HashMap<Integer, HashSet<Integer>> map=new HashMap<>();

        for (int[] log : logs) {
            int id = log[0];
            int time = log[1];

            if (!map.containsKey(id)){
                map.put(id,new HashSet<>());
            }
            map.get(id).add(time);
        }

        for (int id : map.keySet()){
            int uam = map.get(id).size();
            answer[uam - 1]++;
        }
        return answer;
    }
}
