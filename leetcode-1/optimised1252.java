public class optimised1252 {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] row  = new boolean[m];
        boolean[] column = new boolean[n];
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            column[indices[i][1]] ^= true;
        }
        int r = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            if (row[i] ){
                r++;
            }
            
        }
        for (int i = 0; i < n; i++) {
            if (column[i]){
                c++;
            }
        }
        return c*m + r*n - 2 *r * c;
    }
}
