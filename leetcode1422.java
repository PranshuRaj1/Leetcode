public class leetcode1422 {
    public static void main(String[] args) {
        System.out.println(maxScore("1111"));
    }

    static int maxScore(String s) {
        //zeros on left plus ones on right
        int ones = 0;  //ones on left
        int zeros = 0;   //zeros on left
        int best = Integer.MIN_VALUE;  // zeros - ones

        for (int i = 0; i < s.length() -1; i++) {
            if (s.charAt(i) =='1' ){
                ones ++ ;

            }else {
                zeros++;
            }
            best  = Math.max(best,zeros - ones);
        }

        if (s.charAt(s.length() - 1) == '1'){
            ones++;
        }
        return  best + ones;
    }
}
