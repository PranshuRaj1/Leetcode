import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode2848 {
    public static void main(String[] args) {

    }
    static int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for(List<Integer> al : nums) {
            for(int i = al.get(0); i <= al.get(1); i++) {
                set.add(i);
            }
        }
        return set.size();
    }
}
