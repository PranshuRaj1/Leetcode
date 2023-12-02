import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode3 {
    public static void main(String[] args) {
        Set<Character> charSet = new HashSet<>();
        System.out.println(charSet);

    }

    static int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        Set<Character> charSet = new HashSet<>();
//        int left = 0;
//
//        for (int right = 0; right < s.length(); right++) {
//            if (!charSet.contains(s.charAt(right))){
//                charSet.add(s.charAt(right));
//                maxLength = Math.max(maxLength,right - left + 1);
//
//            }
//            else {
//                while (charSet.contains(s.charAt(right))){
//                    charSet.remove(s.charAt(left));
//                    left++;
//                }
//                charSet.add(s.charAt(right));
//            }
//        }
//        return maxLength;
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left){
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength,right-left + 1);
            }
            else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right),right);
            }
        }
        return maxLength;

    }
}
