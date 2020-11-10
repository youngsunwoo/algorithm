package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//가장 긴 증가하는 수열
//https://www.acmicpc.net/problem/11053
public class cresendoSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long result = 1;
        int temp = arr[0];
        for(int i=1;i<num;i++){
            if (temp < arr[i]){
                temp = arr[i];
                result += 1;
            }
        }

        System.out.println(result);
    }

}

