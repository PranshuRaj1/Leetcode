public class rotated_occur {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(rotate_array(arr,6));

    }
    static  int rotate_array(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[start] <= arr[mid]){
                if (arr[start] <= target && target<= arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (arr[end] >= target && arr[mid] <= target){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


}
