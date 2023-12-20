import java.util.Arrays;

public class leetcode2706 {
    public static void main(String[] args) {

    }
    static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if (prices[0] + prices[1] <= money){
            return money - prices[0] - prices[1];
        }
        else {
            return money;
        }
    }
}
