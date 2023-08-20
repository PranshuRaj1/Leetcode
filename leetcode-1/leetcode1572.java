public class leetcode1572 {
    public static void main(String[] args) {
        int[][] mat  = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(diagonalSum(mat));


    }
    static int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        if (mat.length == 1 && mat[0].length == 1){
            return mat[0][0];
        }
        for (int i = 0; i < len; i++) {
            sum = sum + mat[i][i];
            sum = sum + mat[i][len - i -1];

        }

        if (len %2 != 0){
            sum = sum - mat[len/2][len/2];
        }

        return sum;

    }
}
