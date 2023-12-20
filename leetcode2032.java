import java.util.*;

public class leetcode2032 {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int[] arr1 = {2,3};
        int[] arr3 = {1,2};
        System.out.println(twoOutOfThree(arr1,arr3,arr));
    }
    static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();

        int[] temp1 = new int[101];
        int[] temp2 = new int[101];
        int[] temp3 = new int[101];
        int max = Math.max(nums1.length, Math.max(nums2.length, nums3.length));
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < max; i++) {
            if (count1 < nums1.length){
                temp1[nums1[i]]++;
                count1++;
            }
            if (count2 < nums2.length){
                temp2[nums2[i]]++;
                count2++;
            }
            if (count3 < nums3.length){
                temp3[nums3[i]]++;
                count3++;
            }
        }

        for (int i = 0; i < 101; i++) {
            if (temp1[i] > 0 && temp2[i] > 0 && temp3[i]>0  || temp1[i]>0 && temp2[i]>0 || temp2[i]>0 && temp3[i]>0 || temp1[i]>0 && temp3[i]>0 ){
                result.add(i);
            }
        }



        return result;

    }
}
