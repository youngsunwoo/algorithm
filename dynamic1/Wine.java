package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//포도주
//https://www.acmicpc.net/problem/2156
public class Wine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        int d[] = new int[num];

        d[1]=arr[1];
        d[2] = d[1] + arr[2];
        for (int i = 2; i <= num; i++) {
            //i번째 마실때
            int temp = Integer.max(d[i-3] + arr[i-1] + arr[i],  d[i-2] + arr[i]);

            //i번째 안 마실때
            d[i] = Integer.max(temp, d[i-1]);

        }

       System.out.println(d[num]);
    }
}
