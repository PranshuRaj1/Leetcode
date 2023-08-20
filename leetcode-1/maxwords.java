public class maxwords {
    public static void main(String[] args) {
        String[] strr = {"hi","how are you","pranshu raj"};
        System.out.println(mostWordsFound(strr));

    }
    static int mostWordsFound(String[] sentences) {
        int len = sentences.length;
        int max = 0;
        for(int i=0; i<sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;

    }

}
