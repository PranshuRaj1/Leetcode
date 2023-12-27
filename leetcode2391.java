import java.util.HashMap;
import java.util.Map;

public class leetcode2391 {
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};

        System.out.println(garbageCollection(garbage,travel));

    }

    static int garbageCollection(String[] garbage, int[] travel) {
        //Array to store the prefix sum in travel
        int[] prefixSum = new int[travel.length + 1];
        prefixSum[1] = travel[0];

        for (int i = 1; i < travel.length; i++) {
            prefixSum[i+1] = prefixSum[i] + travel[i];
        }

        Map<Character, Integer> garbageLastPosition = new HashMap<>();
        //store total count of each type of garbage
        Map<Character, Integer>garbageCount = new HashMap<>();
        for (int i = 0; i < garbage.length; i++) {
            for (char c : garbage[i].toCharArray()) {
                garbageLastPosition.put(c, i);
                garbageCount.put(c, garbageCount.getOrDefault(c, 0) + 1);
            }
        }
        String garbageTypes = "MPG";
        int time = 0;

        for (char c :
                garbageTypes.toCharArray()) {
            if (garbageCount.containsKey(c)) {
                time = time + prefixSum[garbageLastPosition.get(c)] + garbageCount.get(c);

            }
        }

        return time;
    }
}
