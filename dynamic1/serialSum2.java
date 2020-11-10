package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//연속합2
//https://www.acmicpc.net/problem/13398
//△
public class serialSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> serialSum = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int temp = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            temp  = Integer.max(arr.get(i) + temp , arr.get(i));
            serialSum.add(temp);
        }


        for (int i = 0; i < arr.size(); i++) {
            List<Integer> tempArr = new ArrayList<>(arr.size());
            for(int a:arr){
                tempArr.add(a);
            }
            tempArr.remove(i);
            int temp2 = tempArr.get(0);
            for (int j = 1; j < tempArr.size(); j++) {
                temp2  = Integer.max(tempArr.get(j) + temp2 , tempArr.get(j));
                serialSum.add(temp2);
            }
        }
        System.out.println(Collections.max(serialSum));
    }

}

