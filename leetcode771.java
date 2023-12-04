import java.util.HashSet;

public class leetcode771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z","ZZz"));

    }
    static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int stone = 0;
        for (char ch :
                jewels.toCharArray()) {
            set.add(ch);
        }
        for (char ch :
                stones.toCharArray()) {
            if (set.contains(ch)){
                stone++;
            }
        }
        return stone;
    }

}
