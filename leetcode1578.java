public class leetcode1578 {
    public static void main(String[] args) {
        String colots = "aaabbbabbbb";
        int[] arr ={3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minCost(colots,arr));
        System.out.println(minCost1(colots,arr));

    }
    static int minCost(String colors, int[] neededTime) {
        int timeNeeded = 0;


        for (int i = 1, j = 0; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(j)){
                timeNeeded += Math.min(neededTime[i],neededTime[j]);
                if (neededTime[i] > neededTime[j]){
                    j = i;
                }
            }
            else {
                j = i;
            }
        }
        return  timeNeeded;

    }

    static int minCost1(String colors, int[] neededTime) {
        char[] arr = colors.toCharArray();
        int maxTime = neededTime[0];
        char current = arr[0];
        int time = 0;


        for (int i = 1; i < neededTime.length ; i++) {
            if (current == arr[i]){
                if (neededTime[i] > maxTime){
                    time = time + maxTime;
                    maxTime = neededTime[i];
                }
                else {
                    time = time + neededTime[i];
                }
            }
            else {
                current = arr[i];
                maxTime = neededTime[i];
            }
        }

        return time;
    }
    static int minCost2(String colors, int[] neededTime) {
        int needed=0;
        int n=neededTime.length;
        char[] chc=colors.toCharArray();
        int cur_max=neededTime[0];
        for(int i=1;i<n;i++){
            if(chc[i-1]!=chc[i]){
                cur_max=neededTime[i];
            }else{
                needed+=Math.min(cur_max, neededTime[i]);
                cur_max=Math.max(cur_max, neededTime[i]);
            }
        }
        return needed;
    }
}
