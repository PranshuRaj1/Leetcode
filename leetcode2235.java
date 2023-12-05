import java.util.HashMap;

public class leetcode2235 {
    public static void main(String[] args) {

    }
    static String decodeMessage(String key, String message) {

        HashMap<Character,Character> letters = new HashMap<Character,Character>();
        int cr = 0;
        StringBuilder ans = new StringBuilder();
        for (char c :
                key.toCharArray()) {
            if (c == ' ' || letters.containsKey(c)){
                continue;
            }
            else {
                letters.put(c,(char) ('a' + (cr++)));
            }
        }
        for(char ch:message.toCharArray())
        {
            ans.append((ch==' ')? ' ': letters.get(ch));
        }
        return ans.toString();
    }


}
