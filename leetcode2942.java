import java.util.ArrayList;
import java.util.List;

public class leetcode2942 {
    public static void main(String[] args) {
        String[] arr = {"leet","code"};
        System.out.println(findWordsContaining(arr,'e'));
    }
    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < words.length; ++i){
            for(int j = 0; j < words[i].length(); ++j){
                if(words[i].charAt(j) == x) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;

    }
}
