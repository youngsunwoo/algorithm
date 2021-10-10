
package acmicpc.step3;

import java.io.*;

//https://www.acmicpc.net/problem/2742
public class Task06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = count; i>0 ; i--)
            System.out.println(i);
    }
}