import java.util.ArrayList;
import java.util.List;

public class leetcode2351 {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abcdd"));
    }
    static char repeatedCharacter(String s) {
        List<Character> list = new ArrayList<>();
        for (char c :
                s.toCharArray()) {
            if (list.contains(c)){
                return c;
            }
            else {
                list.add(c);
            }
        }
        return 'a';
    }
}
