import java.util.HashSet;
import java.util.Set;

public class leetcode809_1 {
    public static void main(String[] args) {

    }
    static int uniqueMorseRepresentations(String[] words) {
        String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                sb.append(str[s.charAt(i)-97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
