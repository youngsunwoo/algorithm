package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//스택수
//https://www.acmicpc.net/problem/1406
public class StackSequence {
    private static String test() {
        String result = "";

        List<Integer> array = new ArrayList<>(List.of(1,2,5,3,4));
        Integer limit = array.size();
        Stack<Integer> stack = new Stack<Integer>();
        Integer i = 1;

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
