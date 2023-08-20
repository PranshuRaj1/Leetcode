import java.util.ArrayList;
import java.util.List;

public class leetcode989 {
    public static void main(String[] args) {
//        int num = 1200;
//        System.out.println(num/Math.pow(10,3));
//        System.out.println(num/Math.pow(10,2));
//        int[] arr ={1,2,0,0};
//        System.out.println(addToArrayForm(arr,34));
//        int total = 1234;
//        int req = (int) (total/Math.pow(10, 3));
//        System.out.println(req);
//        total%= 1000;
//        System.out.println(total);
//        int req1 = (int) (total/Math.pow(10, 2));
//        System.out.println(req1);
//        total%= 100;
//        System.out.println(total);
//        int req2 = (int) (total/Math.pow(10, 1));
//        System.out.println(req2);
//        total%= 10;
//        System.out.println(total);
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num,k));

    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> req= new ArrayList<Integer>();
        int len = num.length;
        int div = (int) Math.pow(10, len-1);
        int number = 0;
        while (div>10){
        for (int i = 0; i < len; i++) {

                number = number + num[i]*div;
                div/=10;
            }

        }
        System.out.println(number);

        int total = number + k;
        String t = Integer.toString(total);
        int num_req = 0;
        int len_new = t.length() ;
        int div1 = (int) Math.pow(10, len_new-1);
        for (int i = 0; i < len; i++) {

            num_req = total/div1;
            total%= Math.pow(10, len_new-1);

            req.add(num_req);
            div1 = div1/10;
            len_new--;


        }

        return req;


    }

}
