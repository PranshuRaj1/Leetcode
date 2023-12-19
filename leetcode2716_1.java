public class leetcode2716_1 {
    public static void main(String[] args) {
        System.out.println(minimizedStringLength("aaabc"));
    }
    static int minimizedStringLength(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        boolean [] array = new boolean[26];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';
            if (!array[pos]) {
                res++;
                array[pos] = true;
            }
        }
        return res;
    }
}
