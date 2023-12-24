import java.util.Arrays;

public class leetcodeCntest21 {
    public static void main(String[] args) {
        int[] arr1 = {2};
        int[] arr2 = {4};
        System.out.println(maximizeSquareArea(6,7,arr1,arr2));
    }
    static int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Arrays.sort(hFences);
        Arrays.sort(vFences);

        int maxSide = Math.min(m, n);
        int left = 0, right = maxSide, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isValidSquare(mid, hFences, vFences)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result == -1 ? -1 : (int) ((long) result * result % 1_000_000_007);
    }
    static boolean isValidSquare(int side, int[] hFences, int[] vFences) {
        int hCount = 0, vCount = 0;
        int hIdx = 0, vIdx = 0;

        for (int i = 1; i <= side; i++) {
            while (hIdx < hFences.length && hFences[hIdx] == i) {
                hCount++;
                hIdx++;
            }

            while (vIdx < vFences.length && vFences[vIdx] == i) {
                vCount++;
                vIdx++;
            }
        }

        return hCount <= side && vCount <= side;
    }
}
