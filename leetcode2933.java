import java.util.*;

public class leetcode2933 {
    public static void main(String[] args) {
        List<List<String>> accessTimes = Arrays.asList(
                Arrays.asList("a", "0549"),
                Arrays.asList("b", "0457"),
                Arrays.asList("a", "0532"),
                Arrays.asList("a", "0621"),
                Arrays.asList("b", "0540")
        );
        System.out.println(findHighAccessEmployees(accessTimes));
    }
    static List<String> findHighAccessEmployees(List<List<String>> access_times) {
        TreeMap<String,List<Integer>> map = new TreeMap<>();

        for (List<String> list: access_times){
            if (!map.containsKey(list.get(0))){
                map.put(list.get(0),new ArrayList<>());
            }
            char[] arr = list.get(1).toCharArray();
            int hour = (arr[0] - '0')*10 + arr[1] - '0';
            int minute = (arr[2] - '0')*10 + arr[3] - '0';
            map.get(list.get(0)).add(hour*60 + minute);
        }

        List<String> ans = new ArrayList<>();
        for (String key :
                map.keySet()) {
            List<Integer> value = map.get(key);
            Collections.sort(value);

            for (int i = 0; i < value.size() - 2; i++) {
                if (value.get(i+2) - value.get(i) <= 59){
                    ans.add(key);
                    break;
                }
            }
        }
        return ans;

    }
}
