package problems;

import java.util.Arrays;

public class prob1470 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,3,2,1};
        int n=4;
        shuffle(arr,n);
    }
    // public static int[] shuffle(int[] arr,int n){

    //     for(int j=0;j<arr.length-1;j++){
    //      if(j%2!=0){
    //        int from=n;
    //        int to=j;
    //        int temp=arr[from];
    //        for(int i=from;i>to;i--){
    //   arr[i]=arr[i-1];
    // }
    // arr[to]=temp;
    // n++;
    //      }
 
    //     }
    //     return arr;
    // }


    public static void  shuffle(int[] arr,int n){
int i=0;
int j=i+n;
int x=0;
int [] result=new int[arr.length];
for(int k=0;k<n;k++){
result[x]=arr[i];
result[x+1]=arr[j];
i++;
j++;
x+=2;
}
System.out.println(Arrays.toString(result));
    }
}
