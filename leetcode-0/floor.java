public class floor {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(floor_program(arr,25 ));
        System.out.println(ceil_program(arr,25 ));

    }
    static int floor_program(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] <= target){
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
    static int ceil_program(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] >= target){
                ans = mid;
                end = mid - 1;

            }
            else {
                start = mid + 1;
            }
        }
        return arr[ans];
    }
}
