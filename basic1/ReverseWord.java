package basic1;

import java.util.Scanner;
import java.util.Stack;

//단어뒤집기
//https://www.acmicpc.net/problem/9093
class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.nextLine();

        int count = 0;
        while (count < limit) {
            String input = sc.nextLine();
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

            System.out.println();
            count++;
        }
    }
}
