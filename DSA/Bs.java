import java.util.Scanner;
import java.util.Arrays;
public class Bs {
    // public static void main(String[] args) {
    //     int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //     spiral(arr);
    // }
//     public static void spiral (int[][] arr){
//      int minr=0;
//      int maxr=arr.length-1;
//      int minc=0;
//      int maxc=arr[0].length-1;
//      int totalel=arr.length*arr[0].length;
//      int count=0;
//      while(count<totalel){
//         for(int i=minc;i<=maxc && count<totalel;i++){
//         System.out.println(arr[minr][i]);
//         count++;
//         }minr++;
//         for(int i=minr;i<=maxr && count<totalel;i++){
//         System.out.println(arr[i][maxc]);
//         count++;
//         }maxc--;
//         for(int i=maxc;i>=minc && count<totalel;i--){
//             System.out.println(arr[maxr][i]);
//             count++;
//         }maxr--;
//         for(int i=maxr;i>=minr && count<totalel;i--){
//             System.out.println(arr[i][minc]);
//             count++;
//         }minc++;
// }




public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int nos=sc.nextInt();
            int noc=sc.nextInt();
            int[] stall=new int[nos];
            for(int i=0;i<stall.length;i++){
                stall[i]=sc.nextInt();

            }
            Arrays.sort(stall);

    }
public static int mindis (int[] stall,int noc){
     int lo=stall[0];
     int hi=stall[stall.length-1];
     int ans=0;
     while(lo<=hi){
       int mid=lo+hi/2;
       if(isitpossible(stall,noc,mid)==true){
        ans=mid;
        lo=mid+1;
       }else{
        hi=mid-1;
       }
     }return ans;
}
public static boolean isitpossible(int[] stall,int noc,int mid){
      int pos=stall[0];
      int cow=1;
      for(int i=0;i<stall.length;i++){
        if(stall[i]-pos>=mid){
           cow++;
           pos=stall[i];
        if(cow==noc){
            return true;
        }}}
      return false;
}
}



