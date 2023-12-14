import java.util.HashSet;

public class leetcode1748 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(sumOfUnique(arr));

    }

    static int sumOfUnique(int[] nums) {
        HashSet<Integer> unqiue = new HashSet<>();
        HashSet<Integer> repeat = new HashSet<>();

        int sum = 0;

        for (int num : nums) {
            if (!repeat.contains(num)){
                if (!unqiue.contains(num)){
                    unqiue.add(num);
                }
                else {
                    unqiue.remove(num);
                    repeat.add(num);
                }
            }
        }
        for (int num : unqiue) {
            sum = sum + num;
        }
        return sum;


    }
}
