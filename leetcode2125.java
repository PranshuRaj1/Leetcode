public class leetcode2125 {
    public static void main(String[] args) {
        String[] arr = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(arr));
    }
    static int numberOfBeams1(String[] bank) {

        int ans = 0;
        int prev = 0;

        for (String str :
                bank) {
            int count = 0;
            for (char c :
                    str.toCharArray()) {
                if (c == '1'){
                    count++;
                }
            }
            if (count > 0){
                ans = ans + count*prev;
                prev = count;
            }
        }
        return ans;
    }
    static int numberOfBeams(String[] bank) {
        int prevRowCount = 0;
        int total=0;

        for(String row : bank) {
            int curRowCount = calc(row);
            if(curRowCount==0)
                continue;

            total += curRowCount * prevRowCount;
            prevRowCount = curRowCount;
        }
        return total;
    }

    private static int calc(String s) {
        int count = 0;
        for(char c : s.toCharArray())
            count += c - '0';

        return count;
    }
}
