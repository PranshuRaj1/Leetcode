import java.util.ArrayList;
import java.util.List;

public class leetcode989_opt {
    public List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> sum = new ArrayList<Integer>();
        int length = num.length;
        num[length - 1] += K;
        for (int i = length - 1; i > 0; i--) {
            int curNum = num[i];
            if (curNum >= 10) {
                num[i - 1] += curNum / 10;
                num[i] %= 10;
            }
        }
        char[] highestArray = String.valueOf(num[0]).toCharArray();
        for (char c : highestArray) {
            int digit = c - '0';
            sum.add(digit);
        }
        for (int i = 1; i < length; i++)
            sum.add(num[i]);
        return sum;
    }
}
