public class leetcode1217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.println(minCostToMoveChips(arr));

    }
    static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        int len = position.length;
        for (int i = 0; i < len; i++) {
            if (position[i]%2 == 1){
                odd++;
            }
            else {
                even++;
            }
        }
       return Math.min(odd,even);

    }
}
