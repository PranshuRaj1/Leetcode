public class leetcode1742 {
    public static void main(String[] args) {
        System.out.println(countBalls(1,10));
    }

    static int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int temp = i;
            int box = 0;
            while (temp > 0){
                box += temp %  10;
                temp /= 10;
            }
            arr[box]++;
            if(arr[box] > max){
                max = arr[box];
            }
        }
        return max;
    }
}
