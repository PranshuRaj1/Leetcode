public class leetcode1854 {
    public static void main(String[] args) {
        int[][] arr = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(arr));

    }
    static int maximumPopulation(int[][] logs) {
//        int len = logs.length;
//        int[] arr = new int[101];
//
//        for (int i = 0; i < len; i++) {
//            for (int j = logs[i][0]; j <logs[i][1] ; j++) {
//                arr[j - 1950]++;
//
//            }
//        }
//        int max_year = 1950;
//        int max_value = 0;
//        for (int i = 0; i < 101; i++) {
//            if (arr[i] > max_value){
//                max_value = arr[i];
//                max_year = i + 1950;
//
//            }
//
//        }
//        return max_year;
        int arr[] = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }

        for (int i = 1; i < 101 ; i++) {
            arr[i] = arr[i] + arr[i -1];

        }

        int max_year = 1950;
        int max_value = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > max_value){
                max_value = arr[i];
                max_year = i + 1950;
            }
        }
        return max_year;
    }
}
