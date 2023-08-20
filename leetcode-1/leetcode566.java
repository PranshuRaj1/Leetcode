public class leetcode566 {
    public static void main(String[] args) {

    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows_orignal = mat.length;
        int column_orignal = mat[0].length;

        if (rows_orignal * column_orignal != r * c) {
            return mat;
        }
        int[][] reshape = new  int[r][c];
        for (int i = 0; i < rows_orignal * column_orignal; ++i) {
            reshape[i / c][i % c] = mat[i / column_orignal][i % column_orignal];
        }
        return reshape;
//        int originalRows = mat.length, originalColumns = mat[0].length;
//        if (originalRows * originalColumns != r * c)
//            return mat;
//        int[][] reshape = new int[r][c];
//        int total = originalRows * originalColumns;
//        for (int i = 0; i < total; i++) {
//            int originalRow = i / originalColumns, originalColumn = i % originalColumns;
//            int currentRow = i / c, currentColumn = i % c;
//            reshape[currentRow][currentColumn] = mat[originalRow][originalColumn];
//        }
//        return reshape;


    }

}
