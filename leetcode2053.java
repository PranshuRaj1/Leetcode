import java.util.HashMap;

public class leetcode2053 {
    public static void main(String[] args) {
        String[] arr = {"a","d","a","b"};
        System.out.println(kthDistinct(arr,2));
    }
    static String kthDistinct(String[] arr, int k) {
        if (k == 0){
            return arr[0];
        }
        HashMap<String,Integer> map = new HashMap<>();

        for (String str: arr){
            if (map.containsKey(str)){
                map.put(str,map.getOrDefault(str,0)+1);
            }
            else {
                map.put(str,1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1){
                if (k - 1 == 0){
                    return arr[i];
                }
                else {
                    k --;
                }
            }
        }
        return "";

    }
}
