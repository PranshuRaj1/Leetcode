public class leetcode2391_1 {
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};

        System.out.println(garbageCollection(garbage,travel));
    }
    static  int garbageCollection(String[] garbage, int[] travel) {
        Boolean M = false, P = false, G = false;
        int ans = garbage[0].length();

        for (int i = garbage.length - 1; i > 0; i--) {
            M |= garbage[i].contains("M");
            P |= garbage[i].contains("P");
            G |= garbage[i].contains("G");
            ans += travel[i - 1] * ((M ? 1 : 0) + (P ? 1 : 0) + (G ? 1 : 0)) + garbage[i].length();
        }
        return ans;
    }
}
