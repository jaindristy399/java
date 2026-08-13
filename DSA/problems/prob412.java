package problems;

import java.util.ArrayList;
import java.util.List;

public class prob412 {
    public static void main(String[] args) {
        int n=5;
        fizzbuzz(n);
    }
    // public static void fizzbuzz(int n){
    //     String[] arr=new String[n];
    //     for(int i=0;i<n;i++){
    //     if((i+1)%3==0 && (i+1)%5==0){
    //        arr[i]="fizzbuzz";
    //     }else if((i+1)%3==0){
    //         arr[i]="fizz";
    //     }else if((i+1)%5==0){
    //         arr[i]="buzz";
    //     }else{
    //         arr[i]=String.valueOf(i+1);
    //     }
    //     System.out.println(arr[i]);
    // }
    // }
    public static List<String> fizzbuzz(int n) {

        List<String> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
        if((i+1)%3==0 && (i+1)%5==0){
           arr.add("FizzBuzz");
        }else if((i+1)%3==0){
            arr.add("Fizz");
        }else if((i+1)%5==0){
            arr.add("Buzz");
        }else{
            arr.add(String.valueOf(i+1));
        }
    }return arr;
    }
}

