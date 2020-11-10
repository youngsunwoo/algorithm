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

        int[] arr = new int[num+1];

        arr[1] = 10;

        for(int i=2;i<num+1;i++){
            for(int j=0;j<arr[i-1];j++)
            {
                arr[i] +=1;
            }
        }

        System.out.println(arr[num]);


    }

}

