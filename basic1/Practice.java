package basic1;

import java.util.Stack;

public class Practice {

    private void printStack(Stack stack){
        while (!stack.empty()) System.out.print(stack.pop());
    }
    //https://www.acmicpc.net/problem/17413
    public void reserveWord2(String sentence) {
        Stack<Character> stack = new Stack();
        boolean is_tag = false;

        for (int i = 0; i < sentence.length(); i++) {
            Character c = sentence.charAt(i);

            if (c.equals('<')) { //여는태그, 스택을 출력
                printStack(stack);
                is_tag = true;
                System.out.print(c);
                continue;
            }

            if (c.equals('>')) { // 닫는태그
                is_tag = false;
                System.out.print(c);
                continue;
            }

            if (is_tag) { //tag 밖이면 문자열 뒤집기
                System.out.print(c);
            } else { //tag 안이면 그대로 출력
                if (c.equals(' ')) {
                    printStack(stack);
                } else {
                    stack.push(sentence.charAt(i));
                }
            }
            }
        }
    }

    public void

}
