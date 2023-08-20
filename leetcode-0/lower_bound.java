public class lower_bound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        System.out.println(lower_b(arr,25));

    }


    static int lower_b(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return  ans;
    }
}
