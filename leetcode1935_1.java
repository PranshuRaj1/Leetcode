import java.util.HashMap;
import java.util.HashSet;

public class leetcode1935_1 {
    public static void main(String[] args) {

    }

    static int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        String[] temp= text.split(" ");

        for (int i = 0; i < brokenLetters.length(); i++) {
            char ch = brokenLetters.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < temp.length; i++) {
            boolean flag = fun(temp[i],map );
            if (flag) {
                ans++;
            }
        }

        return ans;
    }
    static boolean fun(String s, HashMap<Character, Integer> map){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                return false;
            }
        }

        return true;
    }
}
