package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//쉬운계단수
//https://www.acmicpc.net/problem/10844
public class stairNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[101][10];

        for(int i=1;i<=9;i++) arr[1][i] = 1;
        for(int i=2 ; i<=num ;i++){
            for(int j=0;j<=9;j++){
                arr[i][j] = 0;
                if(j-1>=0) arr[i][j] += arr[i-1][j-1];
                if(j+1<=9) arr[i][j] += arr[i-1][j+1];
            }
        }

        long result = 0;
        for(int i=0;i<10;i++){
            result += arr[num][i];
        }

        System.out.println(result);
    }

}

