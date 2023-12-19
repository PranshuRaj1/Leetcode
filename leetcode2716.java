import java.util.HashSet;
import java.util.Set;

public class leetcode2716 {
    public static void main(String[] args) {
        System.out.println(minimizedStringLength("dddaaa"));

    }
    static int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();

        for (char c :
                s.toCharArray()) {
            set.add(c);
        }


        return set.size();

    }
}
