package math1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BinaryToOctal {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String binaryNum =  sc.nextLine();
//
//        Stack<Integer> binary = new Stack<>();
//
//        for(int 1=0;i<binary.)


    }
    public static Stack<Integer> binaryToOctal(Stack<Integer> binary) {
        Stack<Integer> output = new Stack<>();
        int num = 0;
        int i = 0;
        while (!binary.isEmpty()) {
            num += binary.pop() * Math.pow(2, i % 3);
            if ((i + 1) % 3 == 0 || binary.isEmpty()) {
                output.push(num);
                num = 0;
            }
            i++;
        }
        return output;
    }

    private static void printStack(Stack stack) {
        while (!stack.empty()) System.out.print(stack.pop());
    }
}
