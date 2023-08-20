public class cells1252 {
    public static void main(String[] args) {

    }
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            //column
            for (int column = 0; column < n; column++) {
                ans[indices[i][0]][column]++;
            }
            for (int row = 0; row < m; row++) {
                ans[row][indices[i][1]]++;
            }
        }
        int count = 0;
        for (int number = 0; number <m ; number++) {
            for (int i = 0; i < n; i++) {
                if (ans[number][i] % 2 != 0 ){
                    count++;
                }

            }

        }
        return count;


    }
}
