package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2×n 타일링
//https://www.acmicpc.net/problem/11726
//O
public class TwoByOneTile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];;
        arr[0] = 1; arr[1]=1;
        for(int i=2 ; i<=num;i++){
            arr[i] = arr[i-1] + arr[i-2];
            arr[i] %= 10007;
        }
        System.out.println(arr[num]);
    }
}

