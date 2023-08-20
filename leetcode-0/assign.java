public class assign {
    public static void main(String[] args) {

    }
    static int gcd(int m, int n) {
        if (n > m) {
            int temp = m;
            m = n;
            n = temp;
        }
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }

        return m;
    }
}
