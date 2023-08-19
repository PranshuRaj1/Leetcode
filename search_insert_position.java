public class search_insert_position {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9};
        int n = 8;
        System.out.println(insert_position(arr,n));
    }
    static int insert_position(int[] arr ,int target){
        int len = arr.length;
        int start = 0;
        int end = len -1;
        int ans = -1;
        while (start <= end){
            int mid  = start + (end - start)/2;

            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
