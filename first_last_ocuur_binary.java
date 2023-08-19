import java.util.Arrays;

public class first_last_ocuur_binary {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,60,60,60,122};

        System.out.println(Arrays.toString(first_second(arr,60)));
        System.out.print("Total Occurrence is:-");
        System.out.println((first_second(arr,60))[1]- first_second(arr,60)[0] + 1);

    }
    static int[] first_second(int[] arr,int target ){
        int first = first(arr,target);
        int second = second(arr, target);
        if (first == -1 || second == -1){
            return new int[]{-1,-1};
        }
        else {
            return new int[]{first,second};
        }
    }

    static int first(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int second(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
