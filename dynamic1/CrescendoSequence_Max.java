package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//가장 큰 증가하는 부분 수열
//https://www.acmicpc.net/problem/11055
//△
public class CrescendoSequence_Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        int dp[] = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        for(int i=1 ; i<num ; i++){
            dp[i] = arr[i];
            for(int j=0 ; j<i ; j++){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[j]+arr[i],dp[i]);
                }
            }
        }


        int max = 0;
        for(int i=0;i<num;i++) {
            if(dp[i]>max) {
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}

