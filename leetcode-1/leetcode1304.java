import java.util.Arrays;

public class leetcode1304 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumZero(1)));

    }
    static int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n == 1){
            arr[0] = 0;
        }
        if (n%2 != 0){
            for (int i = 0; i < n/2; i++) {
                arr[i] = i+1;
                arr[n-1-i] = -(i+1);
                arr[n/2] = 0;
            }

        }
        if (n%2 == 0){

            for (int i = 0; i < n/2; i++) {
                arr[i] = i+1;
                arr[n-1-i] = -(i+1);
            }
        }
        return arr;

    }
}
