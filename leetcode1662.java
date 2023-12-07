public class leetcode1662 {
    public static void main(String[] args) {
        String[] ar1 = {"abc", "d", "defg"};
        String[] ar2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(ar1,ar2));

    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            one.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            two.append(word2[i]);
        }

        return one.toString().contentEquals(two);

    }
}
