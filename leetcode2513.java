import java.util.Arrays;

public class leetcode2513 {
    public static void main(String[] args) {
        System.out.println(minimizeSet(12,3,2,10));

    }
    static  int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int[] arr1 = new int[uniqueCnt1];
        int[] arr2 = new int[uniqueCnt2];
        int j = 0;
        int i = 0;
        int k = 0;

        while (i < uniqueCnt1 || j <  uniqueCnt2 ) {
            if ((k + 1) % divisor1 != 0 && arr1.length - 1>= i  ) {
                arr1[i] = k+1;
                i++;
                k++;
                continue;
            }
            if ((k + 1) % divisor2 != 0 && arr2.length-1 >= j ){
                arr2[j ] = k + 1;
                j++;
                k++;
                continue;
            }
            k++;

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return Math.max(arr1[arr1.length-1],arr2[arr2.length-1]);

    }
    static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
    static int minimizeSet1(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long l = 1,r = (int)(2 * 1e9);
        long ans = r;
        long lcm = ((long) divisor1 * divisor2) / gcd(divisor1,divisor2);
        for(;l <= r;){
            long mid = (l + r) >> 1;
            long x = mid - mid / divisor1;
            long y = mid - mid / divisor2;
            long z = mid - mid / lcm;
            if(x < (long) uniqueCnt1 || y < (long) uniqueCnt2 || z < (long) (uniqueCnt1 + uniqueCnt2)) l = mid + 1;
            else{
                ans = Math.min(ans,mid);
                r = mid - 1;
            }
        }
        return (int)ans;
    }
}
