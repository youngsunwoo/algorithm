package acmicpc.step3;

import java.io.*;
import java.util.stream.IntStream;

//https://www.acmicpc.net/problem/2741
public class Task05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        IntStream.range(1,count+1).forEach( num -> {
            System.out.println(num);
                }
        );
    }
}


