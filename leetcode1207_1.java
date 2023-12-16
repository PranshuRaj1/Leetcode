import java.util.HashMap;import java.util.HashSet;

public class leetcode1207_1 {
    public static void main(String[] args) {

    }
    static boolean uniqueOccurrences(int[] arr) {
        int[] occurrence = new int [2001];
        for (int num :
                arr) {
            occurrence[num + 1000]++;
        }
        HashSet<Integer> set = new HashSet<>();

        for (int count :
                occurrence) {
            if (count != 0){
                if (!set.add(count)){
                    return false;
                }
            }

        }
        return true;


    }
}
