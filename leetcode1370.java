public class leetcode1370 {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));

    }
    
    static String sortString(String s) {
        int[] freq = new int[26];
        int len = s.length();

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder result = new StringBuilder();

        while (len != 0){
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0){
                    result.append((char) (i+'a'));
                    freq[i]--;
                    len--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0){
                    result.append((char) (i + 'a'));
                    freq[i]--;
                    len--;
                }
            }
        }
        return result.toString();

    }
    
}
