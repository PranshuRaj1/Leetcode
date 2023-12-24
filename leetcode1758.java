import java.util.Arrays;

public class leetcode1758 {
    public static void main(String[] args) {
        System.out.println(minOperations("10010100"));


    }
    static int minOperations(String s) {
        int in_place=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)-'0'==i%2){
                in_place++;
            }
        }
        return Math.min(in_place, (int)s.length()-in_place);

    }
}
