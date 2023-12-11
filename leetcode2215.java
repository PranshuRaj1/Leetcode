import java.util.*;

public class leetcode2215 {
    public static void main(String[] args) {

    }
    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }

        for (int i : set1){
            if (!set2.contains(i)){
                list1.add(i);
            }
        }
        for (int i : set2){
            if (!set1.contains(i)){
                list2.add(i);
            }
        }
        answer.add(list1);
        answer.add(list2);

        return answer;


    }
}
