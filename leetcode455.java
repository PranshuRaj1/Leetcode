import java.util.Arrays;

public class leetcode455 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g,s));

    }
    static int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i < g.length && j < s.length){
            if (s[j] >= g[i]){
                count++;
                i++; // --> next child
            }

            j++; // --> next cookie
        }
        return count;
    }
    static int findContentChildren1(int[] g, int[] s) {
        //O(nolgn)
        //S(1)
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1, j = s.length - 1;
        int c = 0;
        while(i >= 0 && j >= 0){
            if(g[i] <= s[j]){
                j--;
                c++;
            }
            i--;
        }

        return c;
    }
}
