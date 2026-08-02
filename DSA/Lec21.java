import java.util.Arrays;
import java.util.Scanner;

public class Lec21 {
    // public static int mindis (int[] stall,int noc){
//      int lo=stall[0];
//      int hi=stall[stall.length-1];
//      int ans=0;
//      while(lo<=hi){
//        int mid=lo+hi/2;
//        if(isitpossible(stall,noc,mid)==true){
//         ans=mid;
//         lo=mid+1;
//        }else{
//         hi=mid-1;
//        }
//      }return ans;
// }
// public static boolean isitpossible(int[] stall,int noc,int mid){
//       int pos=stall[0];
//       int cow=1;
//       for(int i=0;i<stall.length;i++){
//         if(stall[i]-pos>=mid){
//            cow++;
//            pos=stall[i];
//         if(cow==noc){
//             return true;
//         }}}
//       return false;
// }
// }



public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int nos=sc.nextInt();
            int[] arr=new int[nos];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();

            }
            Arrays.sort(arr);

    }
public static int mindis (int[] page,int nos){
     int lo=0;
     int hi=0;
     for(int i=0;i<page.length;i++){
        hi+=page[i];
     }
     int ans=0;
     while(lo<=hi){
       int mid=lo+hi/2;
       if(isitpossible(page,nos,mid)==true){
        ans=mid;
        hi=mid-1;
       }else{
        lo=mid+1;
       }
     }return ans;
}


public static boolean isitpossible(int[] page,int nos,int mid){
      int readpage=0;
      int stu=1;
      for(int i=0;i<page.length;i++){
        if(page[i]+readpage<=mid){
           readpage+=page[i];
        }else{
            stu++;
            readpage=page[i];
        }
        if(stu>nos){
            return false;
        }
    }
      return true;
}
}



