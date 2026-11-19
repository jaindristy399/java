package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// public class prob167 {
//     public static void main(String[] args) {
//         int[] arr={2,7,11,15};
//         int target=9;
//         System.out.println(sum(arr,target));
//     }
//     public static int sum(int arr[],int target){
//         List<List<Integer>> present = new ArrayList<>();
//       for(int i=1;i<arr.length;i++){
//         for(int j=2;j<=arr.length;j++){
//           if(arr[i]+arr[j]==target){
//            ArrayList<Integer> pair = new ArrayList<>();
//           pair.add(i);
//             pair.add(j);
//             present.add(pair);
//           }
//           i++;
//           j++;
//       }}
//       return present;
//     }
// }


public class prob167 {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(sum(arr,target)));
    }
    public static int[] sum(int arr[],int target){
      // for(int i=0;i<arr.length;i++){
      //   for(int j=i+1;j<arr.length;j++){
      //     if(arr[i]+arr[j]==target){
      //     return new int[]{i + 1, j + 1};
      //     }
      // }}
      // return new int[]{};
      int i=0;
      int sum=0;
      int j=arr.length-1;
       while(i<j){
        sum=arr[i]+arr[j];
          if(arr[i]+arr[j]==target){
          return new int[]{i + 1, j + 1};
          }else if(sum<target){
            i++;
          }else{
            j--;
          }
      }
      return new int[]{};
    }
  }