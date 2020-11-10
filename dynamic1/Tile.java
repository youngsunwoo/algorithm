package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num+1];
        if(num>2) {
            arr[num] = (num % 2 != 0) ? 0 : arr[num - 2] * 3;
        } else {
            arr[0] = 0; arr[1] = 0; arr[2] = 3;
        }

        System.out.println(arr[num]);
    }
}

