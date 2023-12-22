import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class leetcode763 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println('b' - 'a');
    }
    static List<Integer> partitionLabels(String s) {
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end  = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(start,array[s.charAt(i) - 'a']);
            if ( i == start){
                list.add(i - end + 1);
                end = i +1;            }
        }
        return list;
    }
}
