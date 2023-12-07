public class leetcode12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));

    }
    static String intToRoman(int num) {
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < symbol.length; i++) {
            while (num >= value[i]){
                result.append(symbol[i]);
                num -= value[i];
            }
        }
        return result.toString();

    }
}
