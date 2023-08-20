public class leetcode441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));

    }
    public static int arrangeCoins(int n) {
        long left = 0;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long totalCoins = mid * (mid + 1) / 2;

            if (totalCoins == n) {
                return (int) mid;
            } else if (totalCoins < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }
}
