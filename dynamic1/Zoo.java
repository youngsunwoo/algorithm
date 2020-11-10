package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//동물원
//https://www.acmicpc.net/problem/1309
//O
public class Zoo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num+1];;
        arr[0] = 1; arr[1]=3;
        for(int i=2 ; i<=num;i++){
            arr[i] = (arr[i-2]+ arr[i-1]*2) % 9901 ;
        }
        System.out.println(arr[num]);
    }
}

