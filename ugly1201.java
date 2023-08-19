public class ugly1201 {
    public static void main(String[] args) {
        System.out.println();
        long y = 12;
        long x = 18;
        System.out.println(y == 0 ?x : gcd(x,12));




    }
    public static long gcd(long x, long y) {
        return y == 0? x : gcd(y, x % y);
    }

    public static long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }
    static  boolean divi(long x,long y){
        if (x % y == 0){
            return true;
        }
        return false;
    }

    public static int countUglyNumbers(int x, int a, int b, int c) {
        int count = 0;

        count += x / a;
        count += x / b;
        count += x / c;

        count -= x / lcm(a, b);
        count -= x / lcm(b, c);
        count -= x / lcm(a, c);

        count += x / lcm(a, lcm(b, c));

        return count;
    }




    public static int nthUglyNumber(int n, int a, int b, int c) {
        int left = 1;
        int right = (int) 2e9; // A reasonable upper bound for searching

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (countUglyNumbers(mid, a, b, c) < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
