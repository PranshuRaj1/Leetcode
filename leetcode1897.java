import java.util.HashMap;

public class leetcode1897 {
    public static void main(String[] args) {
        String[] arr = {"abc","aabc","bc"};
        System.out.println(makeEqual(arr));

    }


    static boolean makeEqual(String[] words) {

        if (words.length == 1) {
            return true;
        }
        int totalCharCount = 0;
        for (String s : words) {
            totalCharCount += s.length();
        }
        if (totalCharCount % words.length != 0) {
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }

        for (char ch :
                map.keySet()) {
            int occurrence = map.get(ch);
            if (occurrence % words.length != 0){
                return false;
            }
        }

        return true;

    }
}