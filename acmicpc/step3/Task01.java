package acmicpc.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

//https://www.acmicpc.net/problem/2739
public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gugu = Integer.parseInt(br.readLine()) ;
        br.close();
        for(int i = 1; i<10; i++){
           System.out.println(gugu + " * " + i + " = " + (gugu*i));
        }
//        IntStream.range(2, 10).forEach(i -> {
//            System.out.println(gugu + " * " + i + " = " + (gugu*i));
//        });
    }
}
