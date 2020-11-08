package math1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/9613
//GCD 합
public class SumGCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int count = 0;
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        while (count < limit) {
            list.add(sc.nextInt());
            count++;
        }

        System.out.println("list : " + list);
        System.out.println("gcdList : " + getSumGCD(list));
    }

    public static int getSumGCD(List<Integer> list) {
        List<String> gcdList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int gcd = getGCD(list.get(i), list.get(j));
                gcdList.add("(" + list.get(i) + "," + list.get(j) + ") = " + gcd);
                sum += gcd;
            }
        }
        System.out.println("gcdList : " + gcdList);
        return sum;
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}
