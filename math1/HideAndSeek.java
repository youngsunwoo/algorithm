package math1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/17087
// 숨바꼭질
public class HideAndSeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int myPosition = sc.nextInt();
        int count = 0;
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        while (count < limit) {
            list.add(sc.nextInt());
            count++;
        }
        System.out.println("result==> "+hideAndSeek(myPosition,list));

    }

    public static int hideAndSeek(int myPostion, List<Integer> list)
    {
        List<Integer> distance = new ArrayList<>();

        for (int p : list) {
            if (p > myPostion) {
                distance.add(p - myPostion);
                myPostion = p;
            } else {
                distance.add(myPostion - p);
                myPostion = p;
            }
        }
        return getListGCD(distance);
    }


    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private static int getListGCD(List<Integer> list) {
        int result = getGCD(list.get(0), list.get(1));

        for (int i = 2; i < list.size(); i++) {
            result = getGCD(result, list.get(i));
        }
        return result;
    }



}
