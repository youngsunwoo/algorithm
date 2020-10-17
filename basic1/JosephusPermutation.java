package basic1;

import java.util.*;

//조세푸스 수열
//https://www.acmicpc.net/problem/1158
public class JosephusPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(josephus(m,n));
    }

    private static List<Integer> josephus(int m, int n) {

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            queue.offer(i);
        }

        int index = 1;
        while (!queue.isEmpty()) {
            if ((index++) % n == 0) {
                result.add(queue.poll());
            } else {
                queue.offer(queue.poll());
            }
        }
        return result;
    }
}
