package acmicpc.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2753
public class Task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine()) ;
        br.close();

        System.out.println(year%4 == 0 ? year%100 == 0 ? year%400==0 ? "1" : "0" : "1" : "0");
    }
}
