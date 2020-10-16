package basic1;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    //조세푸스 수열
    //https://code.plus/lecture/483
    private void josephusPermutation(int m, int n) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            queue.offer(i);
        }

        int index = 1;
        while (!queue.isEmpty()) {
            if ((index++) % n == 0) {
                System.out.println(queue.poll());
            } else {
                queue.offer(queue.poll());
            }
        }
    }
}
