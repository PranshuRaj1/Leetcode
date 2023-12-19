public class leetcode661 {
    public static void main(String[] args) {

    }
    static int[][] imageSmoother(int[][] img) {
        int res[][] = new int[img.length][img[0].length];
        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[0].length; j++) {
                res[i][j] = smoothen(img, i, j);
            }
        }
        return res;
    }
    static int smoothen(int[][] img, int i, int j) {
        int m = img.length;
        int n = img[0].length;
        int sum = 0;
        int numberOfElements = 0;

        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {

                int xElement = i + k;
                int yElement = j + l;

                if (xElement < 0 || xElement >= m || yElement < 0 || yElement >= n){
                    continue;
                }
                sum += img[xElement][yElement];
                numberOfElements++;

            }
        }
        return sum / numberOfElements;
    }
}
