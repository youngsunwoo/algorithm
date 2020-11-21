package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//RGB거리
//https://www.acmicpc.net/problem/1149
//
public class RGB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] costs = new int[num+1][3];
        int[][] dp = new int[num + 1][3];

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                costs[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = dp[0][1] = dp[0][2] = costs[0][0] = costs[0][1] = costs[0][2] = 0;

        for(int i=1; i<=num ; i++){
            dp[i][0] = Integer.min(dp[i-1][1],dp[i-1][2]) + costs[i][0];
            dp[i][1] = Integer.min(dp[i-1][0],dp[i-1][2]) + costs[i][1];
            dp[i][2] = Integer.min(dp[i-1][0],dp[i-1][1]) + costs[i][2];

        }
        System.out.println(Integer.min(Integer.min(dp[num][0],dp[num][1]),dp[num][2]));
    }
}

