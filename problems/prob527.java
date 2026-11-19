package problems;

import java.util.Arrays;

public class prob527 {
    public static void main(String[] args) {
        int arr[]={6,2,6,5,1,2};
        pair(arr);
    }
    public static int pair(int arr[]){
        int sum=0;
        Arrays.sort(arr);
        int[] pair=new int[arr.length/2];
        int k=0;

   for(int i=0;i<arr.length;i+=2){
pair[k]=Math.min(arr[i],arr[i+1]);
sum+=pair[k];
k++;
}
return sum;
    }
}
