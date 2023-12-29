import java.util.*;

public class leetcode2570 {
    public static void main(String[] args) {
        int[][] num1 = {{1,2},{2,3},{4,5}};
        int[][] num2 = {{1,4},{3,2},{4,1}};
        System.out.println(Arrays.deepToString(mergeArrays(num2, num1)));

    }
    static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int num[] : nums1) {
            if (map.containsKey(num[0])) {
                map.put(num[0],map.getOrDefault(num[0],0) + num[1] );
            }
            else {
                map.put(num[0],num[1]);
            }
        }

        for (int num[] : nums2) {
            if (map.containsKey(num[0])) {
                map.put(num[0],map.getOrDefault(num[0],0) + num[1] );
            }
            else {
                map.put(num[0],num[1]);
            }
        }


        int[][] ans = new int[map.size()][2];
        int row = 0;

        for (Map.Entry<Integer, Integer> entry:
        map.entrySet()){
            ans[row][0] = entry.getKey();
            ans[row][1] = entry.getValue();
            row++;
        }
        return ans;

    }
    public int[][] mergeArrays1(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList();
        int i = 0, j = 0;
        while(i < nums1.length || j < nums2.length) {
            if(i == nums1.length) {
                while(j < nums2.length) list.add(nums2[j++]);
                break;
            }
            if(j == nums2.length) {
                while(i < nums1.length) list.add(nums1[i++]);
                break;
            }
            if(nums1[i][0] == nums2[j][0]) list.add(new int[]{nums1[i][0], nums1[i++][1] + nums2[j++][1]});
            else if(nums1[i][0] < nums2[j][0]) list.add(nums1[i++]);
            else list.add(nums2[j++]);
        }

        return list.toArray(new int[0][]);
    }
}
