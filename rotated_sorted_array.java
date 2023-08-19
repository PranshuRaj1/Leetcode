public class rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,60,60,60,122};
        System.out.println(r_2(arr,30));
    }
    static boolean r_2(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return true;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
                continue;
            }
            if (arr[start] <= arr[mid]){
                if (arr[start] <= target && arr[mid] >= target ){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] <= target && arr[end] >= target){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
