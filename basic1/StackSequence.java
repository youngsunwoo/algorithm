package basic1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//스택수열
//https://www.acmicpc.net/problem/1406
public class StackSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int count = 0;
        sc.nextLine();
        List<Integer> array = new ArrayList<>();
        while (count < limit) {
            array.add(sc.nextInt());
            count++;
        }

        System.out.println(getStackSequence(array));

    }

    static String getStackSequence(List<Integer> array) {
        Stack<Integer> stack = new Stack<Integer>();
        Integer i = 1;
        String result = "";

        while (!array.isEmpty()) {
            Integer num = array.get(0);
            while (i <= num) {
                stack.push(i++);
                result += "+ ";
            }
            if (stack.peek().equals(num)) {
                stack.pop();
                result += "- ";
            }
            array.remove(0);
        }
        return stack.isEmpty() ? result : "NO";
    }
}
