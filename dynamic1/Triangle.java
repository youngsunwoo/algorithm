package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//정수삼각형
//https://code.plus/lecture/491
public class Triangle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[][] numbers = new int[num][num];
        int[][] dp = new int[num][num];
        for (int i = 0; i < num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        dp[0][0] = numbers[0][0];
        for (int i = 1 ; i < num; i++) {
            for(int j = 0; j<=i ; j++) {
                int temp = 0;
                if(j==0){
                    dp[i][j] = dp[i - 1][j] + numbers[i][j];
                } else {
                    temp = Integer.max(dp[i - 1][j - 1], dp[i - 1][j]) + numbers[i][j];
                }
                dp[i][j] = Integer.max(temp,dp[i][j]);
            }
        }

        int result = 0;
        for(int i=0 ; i < num ; i++){
           result = Integer.max(result,dp[num-1][i]);
        }

       System.out.println(result);
    }
}
