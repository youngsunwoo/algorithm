package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//오르막수
//https://www.acmicpc.net/problem/11057
public class CrescendoNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] dp = new int[num+1][10];
        dp[1][0] = dp[1][1] =dp[1][2] = dp[1][3] =dp[1][4] = dp[1][5] =dp[1][6] = dp[1][7] =dp[1][8] = dp[1][9] =1;

        for(int i=2 ; i<=num ; i++){
            for(int j=0 ; j < 10 ; j++) {
                for (int k = 0 ; k <= j; k++){
                    dp[i][j] += dp[i-1][k];
                }
                dp[i][j] %= 10007;
            }
        }
        int sum = 0;
        for(int i=0;i<10;i++) { // n번 째 행의 경우들을 모두 더한다.
            sum+=dp[num][i]; // 더하는 과정에서 값이 또 커질 수 있으므로
        }
        System.out.println(sum % 10007);

    }

}

