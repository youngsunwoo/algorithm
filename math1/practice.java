package math1;

import java.util.Stack;

public class practice {
    public Stack<Integer> binaryToOctal(Stack<Integer> binary) {
        Stack<Integer> output = new Stack<>();
        int num = 0;
        int i = 0;
        while (!binary.isEmpty()){
            num += binary.pop() * Math.pow(2, i%3);
            if ((i+1) % 3 == 0 || binary.isEmpty()) {
                output.push(num);
                num = 0;
            }
            i++;
        }
        return output;
    }

    public String binaryToOctal2(String input) {
        int n = input.length();
        String result = "";
        if (n%3 == 1) { //세 자리씩 끊었을 때 맨 앞에 한 자리만 남는경우
            result += input.charAt(0);
        } else if (n%3 == 2) { //두 자리만 남는경우
            result += Character.getNumericValue(input.charAt(0))*2
                        + Character.getNumericValue(input.charAt(1));
        }
        //남은숫자처리
        for (int i=n%3; i<n; i+=3) {
            result += Character.getNumericValue(input.charAt(i))*4
                        + Character.getNumericValue(input.charAt(i+1))*2
                         + Character.getNumericValue(input.charAt(i+2));
        }
        return result;
    }

    public String octalToBinary(String octalString) {

        String result = "";
        for(int i=0;i<octalString.length();i++){
            Character c =(octalString.charAt(i));
            if (c == '0') result += "000";
            else if (c == '1') result += "001";
            else if (c == '2') result += "010";
            else if (c == '3') result += "011";
            else if (c == '4') result += "100";
            else if (c == '5') result += "101";
            else if (c == '6') result += "110";
            else if (c == '7') result += "111";
        }
        return result;
    }
}
