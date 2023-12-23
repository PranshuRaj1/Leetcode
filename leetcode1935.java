import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leetcode1935 {
    
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world","ad"));


    }

    static int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        String[] temp= text.split(" ");

        for (int i = 0; i < brokenLetters.length(); i++) {
            char c = brokenLetters.charAt(i);
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].contains(Character.toString(c))){
                    set.add(j);
                }
            }
        }
        return temp.length - set.size();
    }
    
}
