public class finalvalue {
    public static void main(String[] args) {

    }
    static int finalValueAfterOperations(String[] operations){
        int X = 0;
        int len  = operations.length;
        for (int i = 0; i < len; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")){
                X++;
            } else if (operations[i].equals("--X") || operations[i].equals("X--")) {
                X--;
            }
        }
        return X;
    }
}
