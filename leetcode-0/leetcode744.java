public class leetcode744 {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr, 'd'));

    }
    public static  char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int start = 0;
        int end = len - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

             if (letters[mid] <= target) {
                 start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if (start >= letters.length){
            return letters[0];
        }
        else{

            return letters[start];
        }
    }
}
