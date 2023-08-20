import java.util.Arrays;

public class BS2D {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
//        System.out.println(arr.length);
        //00--30,,01--31,02--32,03--33


        System.out.println(Arrays.toString(bs_in_2d(arr, 50)));
        System.out.println(Arrays.toString(search(arr,50)));
    }
    static int[] bs_in_2d(int[][] arr , int target){
        for (int i = 0; i < arr[i].length; i++) {
            if (target == arr[i][0] ){
                return new int[]{i, 0};
            } else if (target == arr[i][arr.length - 1]) {
                return new int[]{i,arr.length - 1};
            } else if (target>arr[i][0] && target < arr[i][arr.length - 1]) {
                int y_coord = binarysearch(arr[i],0, arr.length - 1,target);
                if (y_coord == - 1){
                    int new_y_cord = binarysearch(arr[i+1], 0 , arr.length - 1,target);
                    return new int[]{i+1,new_y_cord};
                }
                else {
                    return new int[]{i,y_coord};
                }

            }

        }
        return new int[]{-1, -1};

    }
    static int binarysearch(int[] arr, int start , int end,int target){
        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid] > target){
                end = start - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }
    static int[] search(int[][] arr ,int target){
        int r = 0;
        int c = arr.length - 1;
        
        while (r< arr.length && c >= 0){
            if (arr[r][c] == target){
                return new int[]{r,c};
            } else if (arr[r][c] < target) {
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
