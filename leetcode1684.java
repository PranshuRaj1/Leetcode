import java.util.HashSet;

public class leetcode1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed,words));

    }

    static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int count = 0;

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            count  =0;
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))){
                    count++;
                }
            }
            if (count == 0){
                ans++;
            }
        }


        return ans;


    }
}
