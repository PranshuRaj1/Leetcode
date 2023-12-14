import java.util.HashMap;
import java.util.HashSet;

public class leetcode1941 {
    public static void main(String[] args) {
        String s = "vvvvvvvvvvvvvvvvvvv";
        System.out.println(areOccurrencesEqual(s));

    }

    static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> repeat = new HashMap<>();

        char[] arr = s.toCharArray();



        for (char ch : arr) {
            int count = 0;
            if (!repeat.containsKey(ch)){
                count = count + 1;
                repeat.put(ch,count);
            }
            else {
                int newCount = repeat.get(ch) + 1;

                repeat.put(ch,newCount);
            }
        }
        boolean ans = true;
        int n = (int) repeat.values().toArray()[0];
        for (int num : repeat.values()) {
            if (num == n){
                ans = true;
            }
            else {
                ans = false;
                break;
            }
        }

        return ans;



    }

}
