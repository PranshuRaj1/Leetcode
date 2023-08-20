public class leetcode885 {
    public static void main(String[] args) {

    }
    //solution not done !!!
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix = new int[rows][cols];
        int row = rStart;
        int column = cStart;
        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;
        int count = 1;


        while (top <= bottom && left <=right){
            //right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count;
                count++;
            }
            top++;

            //top to bottom

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;

            }
            right--;

            if (top <= bottom){
                for (int i = right; i >= left ; i--) {
                    matrix[bottom][i] = count;
                    count++;

                }
            }
            bottom--;

            if (left<= right){
                for (int i = bottom; i >=top ; i--) {
                    matrix[i][left] = count;
                    count++;

                }
            }
            left++;
        }
        return matrix;


    }
}
