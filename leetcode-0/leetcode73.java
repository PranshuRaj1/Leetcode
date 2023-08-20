class leetcode73 {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row = false;
        boolean col = false;

        // Check if the first column needs to be zeroed out
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                col = true;
                break;
            }
        }

        // Check if the first row needs to be zeroed out
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                row = true;
                break;
            }
        }

        // Use the first row and first column to mark other elements to be zeroed out
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the corresponding row to be zeroed out
                    matrix[0][j] = 0; // Mark the corresponding column to be zeroed out
                }
            }
        }

        // Zero out the rows (except the first row) based on the marks in the first column
        for (int i = 1; i < n; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the columns (except the first column) based on the marks in the first row
        for (int j = 1; j < m; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the first row if needed
        if (row) {
            cleanZeroRow(matrix, m);
        }

        // Zero out the first column if needed
        if (col) {
            cleanZeroCol(matrix, n);
        }
    }

    // Helper method to zero out a column
    private void cleanZeroCol(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
    }

    // Helper method to zero out a row
    private void cleanZeroRow(int[][] matrix, int m) {
        for (int j = 0; j < m; j++) {
            matrix[0][j] = 0;
        }
    }
}
