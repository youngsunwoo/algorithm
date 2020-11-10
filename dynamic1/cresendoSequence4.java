package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
//가장 긴 증가하는 수열
//https://www.acmicpc.net/problem/14002
public class cresendoSequence4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        List<Integer> cresendo = new ArrayList();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //init
        long result = 1;
        int temp = arr[0];
        cresendo.add(arr[0]);

        for(int i=1;i<num;i++){
            if (temp < arr[i]){
                cresendo.add(arr[i]);
                temp = arr[i];
                result += 1;
            }
        }

        System.out.println(result);
        for(int num : cresendo){
            System.out.print(num);
        }
    }
}

