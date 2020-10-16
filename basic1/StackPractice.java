package basic1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackPractice {

    //단어뒤집기
    //https://www.acmicpc.net/problem/9093
    public void reverseWord() {
        String input = "I am happy today\nWe want to win the first prize";
        Stack<Character> stack = new Stack();

        for (int i = 0; i < input.length(); ++i) {
            Character c = input.charAt(i);
            if (!c.equals(' ') && c != '\n') {
                stack.push(input.charAt(i));
            } else {
                while (!stack.empty()) {
                    System.out.print(stack.peek());
                    stack.pop();
                }
                System.out.print(c);
            }
        }
        while (!stack.empty()) { //TODO : 문장끝을 어떻게 해야햐지..
            System.out.print(stack.peek());
            stack.pop();
        }
    }

    //스택수열
    //https://www.acmicpc.net/problem/1406
    private String StackSequence() {
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
