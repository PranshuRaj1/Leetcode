import java.util.ArrayList;

public class leetcode809 {
    public static void main(String[] args) {

    }
    static int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String[] code  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (int i = 0; i < words.length; i++) {
            String str = "";

            for (int j = 0; j < words[i].length(); j++) {
                str += code[words[i].charAt(j) - 97];
            }
            if (!ans.contains(str)){
                ans.add(str);
            }
        }
        return ans.size();

    }
}
