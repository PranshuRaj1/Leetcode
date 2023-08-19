public class leetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));

    }
    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;

        while (start <= end){
            int mid = start+ (end - start)/2;
            if (mid*mid == num){
                return true;
            } else if (mid*mid > num) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
