package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//1,2,3 더하기
//https://www.acmicpc.net/problem/9095
public class Adding123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[12];;
        arr[0] = 1; arr[1]=1; arr[2]=2;
        for(int i=3 ; i<=num;i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3] ;
        }
        System.out.println(arr[num]);
    }
}

