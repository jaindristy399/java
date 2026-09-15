package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob1200 {
    public static void main(String[] args) {
        int []arr={3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDiffere(arr));
    }
    public static List<List<Integer>> minimumAbsDiffere(int[] arr){
       Arrays.sort(arr);
       List<List<Integer>> present = new ArrayList<>();
       int i=0;
       int j=1;
       int min=arr[j]-arr[i];
       int x=0;
       while(j<arr.length){
        x=arr[j]-arr[i];
        if(min>x){
          min=x;
          present.clear();
          ArrayList<Integer> pair = new ArrayList<>();
          pair.add(arr[i]);
            pair.add(arr[j]);
            present.add(pair);
        }
        else if(x==min){
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(arr[i]);
        pair.add(arr[j]);
        present.add(pair);
        }
        i++;
        j++;
       }
       return present;
}}
