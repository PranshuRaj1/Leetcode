public class leetcode1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("10133890"));

    }
   static String largestOddNumber(String num) {

       for (int i = num.length() - 1; i >= 0; i--) {
           if (Character.getNumericValue(num.charAt(i)) % 2 != 0){
               return num.substring(0,i+1);
           }
       }
       return "";
   }
    static String largestOddNumber1(String num) {

        int i = num.length() - 1;

        if (num.charAt(i) % 2 != 0){
            return num;
        }
        else {
            while (i >= 0){
                int n = num.length() - 1;
                if (n % 2 != 0){
                    return num.substring(0,i+1);
                }
                i--;
            }
            return "";

        }
    }
}
