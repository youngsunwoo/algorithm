//package math1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//public class Practice {
//
//    //https://www.acmicpc.net/problem/9613 GCD 합
//    public void sumGCD(List<Integer> list) {
//        List<String> gcdList = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                int gcd = getGCD(list.get(i), list.get(j));
//                gcdList.add("(" + list.get(i) + "," + list.get(j) + ") = " + gcd);
//                sum += gcd;
//            }
//        }
//
//        System.out.println("list : " + list);
//        System.out.println("list's GCD pair sum : " + sum);
//        System.out.println("gcdList : " + gcdList);
//    }
//
////    https://www.acmicpc.net/problem/17087 숨바꼭질
//    public void hideAndSeek(int myPostion, List<Integer> list) {
//
//        List<Integer> distance = new ArrayList<>();
//
//        for (int p : list) {
//            if (p > myPostion) {
//                distance.add(p - myPostion);
//                myPostion = p;
//            } else {
//                distance.add(myPostion - p);
//                myPostion = p;
//            }
//        }
//
//        System.out.println("=======" + getListGCD(distance));
//    }
//
//    //https://www.acmicpc.net/problem/1373 2진수 8진수
//    public Stack<Integer> binaryToOctal(Stack<Integer> binary) {
//        Stack<Integer> output = new Stack<>();
//        int num = 0;
//        int i = 0;
//        while (!binary.isEmpty()) {
//            num += binary.pop() * Math.pow(2, i % 3);
//            if ((i + 1) % 3 == 0 || binary.isEmpty()) {
//                output.push(num);
//                num = 0;
//            }
//            i++;
//        }
//        return output;
//    }
//
//    //https://www.acmicpc.net/problem/1373 2진수 8진수
//    public String binaryToOctal2(String input) {
//        int n = input.length();
//        String result = "";
//        if (n % 3 == 1) { //세 자리씩 끊었을 때 맨 앞에 한 자리만 남는경우
//            result += input.charAt(0);
//        } else if (n % 3 == 2) { //두 자리만 남는경우
//            result += Character.getNumericValue(input.charAt(0))
//                    + Character.getNumericValue(input.charAt(1));
//        }
//        //남은숫자처리
//        for (int i = n % 3; i < n; i += 3) {
//            result += Character.getNumericValue(input.charAt(i)) * 4
//                    + Character.getNumericValue(input.charAt(i + 1)) * 2
//                    + Character.getNumericValue(input.charAt(i + 2));
//        }
//        return result;
//    }
//
//    //https://www.acmicpc.net/problem/1212 8진수 2진
//    public String octalToBinary(String octalString) {
//
//        String result = "";
//        for (int i = 0; i < octalString.length(); i++) {
//            Character c = (octalString.charAt(i));
//            if (c == '0') result += "000";
//            else if (c == '1') result += "001";
//            else if (c == '2') result += "010";
//            else if (c == '3') result += "011";
//            else if (c == '4') result += "100";
//            else if (c == '5') result += "101";
//            else if (c == '6') result += "110";
//            else if (c == '7') result += "111";
//        }
//        return result;
//    }
//
//    public int goldbach(int num) {
//        int count = 0;
//        List<Integer> prime = getPrime(num);
//        for (int i = 0; i < num; i++) {
//            if (prime.size() <= i) {
//                break;
//            }
//            int extra = num - prime.get(i);
//            if (prime.contains(extra)) {
//                prime.remove((Integer) extra);
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private int getGCD(int a, int b) {
//        while (b != 0) {
//            int temp = a % b;
//            a = b;
//            b = temp;
//        }
//        return a;
//    }
//
//    private int getListGCD(List<Integer> list) {
//        int result = getGCD(list.get(0), list.get(1));
//
//        for (int i = 2; i < list.size(); i++) {
//            result = getGCD(result, list.get(i));
//        }
//        return result;
//    }
//
//    public List<Integer> getPrime(int num) {
//        List<Integer> prime = new ArrayList<>();
//
//        int[] arr1 = new int[num + 1];
//        boolean[] arr2 = new boolean[][num + 1];
//
//        for (int i = 0; i <= num; i++) {  // 데이터 초기화
//            arr1[i] = i;
//            arr2[i] = true;
//        }
//
//        for (int j = 2; j * j <= num; j++) { // 루트 num 까지만 나누어서 떨어지면 소수가 아니다.
//            if (arr2[j] == false) continue;      // 이미 체크된 수의 배수는 확인 안함.
//            for (int k = j + j; k <= num; k += j) {
//                arr2[k] =false;                // j를 제외한 j의 배수들은 0으로 체크
//            }
//        }
//
//        for (int j = 2; j <= num; j++) {
//            if (arr2[j] == true) prime.add(j);
//        }
//        return prime;
//    }
//}
