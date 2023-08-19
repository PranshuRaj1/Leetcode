import java.util.Deque;
import java.util.LinkedList;

public class leetcode1499 {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,0},{5,10}, {6,-10} };
        System.out.println(findMaxValueOfEquation(arr,1));

    }
    static int findMaxValueOfEquation(int[][] points, int k) {
        //linked list is needed to solve this question
        //Learn linked list first

        int maxVal = Integer.MIN_VALUE;
        Deque<int[]> deque = new LinkedList<>(); // A deque to store the (yi + xi) values within the window

        for (int[] point : points) {
            int xj = point[0];
            int yj = point[1];

            // Remove points from the deque that are outside the window (|xi - xj| > k)
            while (!deque.isEmpty() && xj - deque.peekFirst()[0] > k) {
                deque.pollFirst();
            }

            if (!deque.isEmpty()) {
                int[] prevPoint = deque.peekFirst();
                int yi = prevPoint[1];
                int xi = prevPoint[0];
                maxVal = Math.max(maxVal, yi + yj + (xj - xi));
            }

            // Remove points from the deque that have smaller (yi + xi) values than the current point
            while (!deque.isEmpty() && (yj - xj) >= (deque.peekLast()[1] - deque.peekLast()[0])) {
                deque.pollLast();
            }

            deque.offerLast(new int[]{xj, yj});
        }

        return maxVal;

    }
}
