package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//이친수
//https://www.acmicpc.net/problem/2193
public class NumberOnly01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int d[] = new int[num];

        d[0] = 0; d[1]=1;
        for (int i = 2; i <= num; i++) {
           d[i] = d[i-1] + d[i-2];
        }

        System.out.println(d[num]);
    }

}

