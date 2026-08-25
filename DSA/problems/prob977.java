package problems;
import java.util.*;
public class prob977 {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(square(arr)));
    }
    public static int[] square(int[] arr){

int left=0;
int right=arr.length-1;
int[] ans = new int[arr.length];
int k=arr.length-1;
while(left<=right){
    int leftSquare=arr[left]*arr[left];
    int rightSquare=arr[right]*arr[right];
    if(leftSquare<rightSquare){
        ans[k]=rightSquare;
        right--;
    }else{
        ans[k]=leftSquare;
        left++;
    }k--;
}return ans;



    //  ArrayList <Integer>ll=new ArrayList<>();
    //   for(int i=0;i<arr.length;i++){
    //     ll.add(arr[i]*arr[i]);
    //   }
    //   Collections.sort(ll);
    //   //System.out.println(ll);
      
    //     int[] ans = new int[ll.size()];
    //    for(int k=0;k<ll.size();k++){
    //             ans[k]=ll.get(k);
    //          }
    //         return ans;
    }
}
