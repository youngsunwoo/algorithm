package acmicpc.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/9498
public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine()) % 10;
        br.close();

        System.out.print(score > 8 ? "A" : score > 7 ? "B" : score > 6 ? "C" : score > 5 ? "D" : "F");
    }
}
