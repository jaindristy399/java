// import java.util.Scanner;
public class Array {
 
// public class Main {
// public static void main(String[] args){
    // int[] arr=new int[5];
    // System.out.println(arr);
    // arr[0]=10;
    // arr[1]=20;
    // arr[2]=30;
    // arr[3]=40;
    // arr[4]=50;
    // arr[2]=100;
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(arr[2]);
    // System.out.println(arr[3]);
    // System.out.println(arr[4]);

    // Scanner sc=new Scanner (System.in);
    // int n=sc.nextInt();
    // int[] arr=new int[n];
    // for(int i=0;i<n;i++){
    //     arr[i]=sc.nextInt();
    // }
//     display(arr);
// }
// public static void display(int[] arr) {
//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]+" ");
//     }
// }

// Scanner sc=new Scanner (System.in);
//     int[] arr={2,5,4,1};
//     System.out.println(arr[0]+" "+ arr[1]);
//     swap(arr[0],arr[1]);
// }
// public static void swap(int a,int b) {
//     int temp=a;
//     a=b;
//     b=temp;
//     System.out.println(a+" "+b);
// }

// Scanner sc=new Scanner (System.in);
//     int[] arr={2,5,4,1};
//     int[] other={3,5,8,9};
//     System.out.println(arr[0]+" "+ other[0]);
//     swap(arr,other);
//     System.out.println(arr[0]+" "+other[0]);
// }
// // public static void swap(int[] arr,int[i],int[j]) {
// public static void swap(int[] arr,int[] other) {
//     // int temp=arr[a];
//     // arr[a]=arr[b];
//     // arr[b]=temp;

// //    arr[a]= arr[a]+arr[b];
// //    arr[b]=arr[a]-arr[b];
// //    arr[a]=arr[a]-arr[b];  

// // int []temp= arr;
// // arr=other;
// // other=temp;
// }

// static int val=100;
// public static void main(String[] args){
//     System.out.println("hey");
//     int x=60;
//     System.out.println(val);
//     fun(x);
//     System.out.println(val);
// }

// public static void fun(int x){
//     System.out.println(x);
//     System.out.println(val);
//     int val=17;
//      val=19;
//     System.out.println(val);
// }


// public static void main(String[] args) {
//     int[] arr={2,3,5,-4,7,6};
//     int item=2;
//     System.out.println(search(arr,item));
// }
// public static int search(int[] arr,int item){
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==item){
//             return i;
//         }
//     }return -1;
// }
//     }
  

//GREATEST NUMBER FROM THE aRRAY
// public static void main(String[] args) {
//     int[] arr={2,3,1,51,7,6};
//     System.out.println(max(arr));
// }
// public static int max(int[] arr){
//     int max=arr[0];
    // for(int i=1;i<arr.length;i++){
    //     if(arr[i]>max){
    //         max=arr[i];
    //     }
//     }return max;
// }

//for negative orall val;ue

// public static int max(int[] arr){
//     int max=Integer.MIN_VALUE;
//     for(int i=1;i<arr.length;i++){
//         // if(arr[i]>max){
//         //     max=arr[i];
//         // }

//         max=Math.max(arr[i],max);
//     }return max;
// }


//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//     int n=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//         int i=sc.nextInt();
//         int j=sc.nextInt();
//         reverse(arr,i,j);
//         for(int k=0;k<arr.length;k++){
//             System.out.println(arr[k]+" ");
//         }
//     }
//     public static void reverse(int[] arr,int i,int j) {
//         while(i<j){
//          swap(arr,i, j);
//           i++;
//           j--;
//         }
        
//     }
    // public static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
// }
    



    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        
        // int[] arr = new int[n];
        
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // } 
        // int k = sc.nextInt();
//         int[] arr={1,2,3,4,5};
//         int k=2;
        // rotate(arr,k);    
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
//     }

//     public static void rotate(int[] arr,int k) {
//         k=k%arr.length;
//          for(int s=1;s<=k;s++){
//         int j = arr[arr.length - 1];
       
//         for (int i = arr.length-2; i >= 0; i--) {
//              arr[i+1] = arr[i];
//             //arr[i] = arr[i-1];
//         }
//         arr[0] = j;
//     }
// }
// }


//SORTING

// public static void main(String[] args) {
//     int[] arr={11,9,7,5,8};
// sort(arr);
// for(int x=0;x<arr.length;x++){
//     System.out.println(arr[x]+ " ");
// }
// }

// public static void sort(int[] arr){
//     for(int turn=0;turn<arr.length-1;turn++){
//     for(int m=0;m<arr.length-1;m++){
//     if(arr[m]<arr[m+1]){
//         swap(arr,m,m+1);
//     }
//     }
//     }
//     }


//  COLLECTIVE SORTING
//   [[[[[]]]]] public static void main(String[] args) {
//     int[] arr={3,9,-7,5,8};
// sort(arr);
// for(int x=0;x<arr.length;x++){
//     System.out.println(arr[x]+ " ");
// }
// }

// public static void sort(int[] arr){
//     for(int i=0;i<arr.length-1;i++){
//         swap(arr,i,min(arr,i));
//     }
//     }
    

// //SWAP
// //     public static void swap(int[] arr, int i, int j) {
// //         int temp = arr[i];
// //         arr[i] = arr[j];
// //         arr[j] = temp;
// //     }
// // }


//MIN

// public static int min(int[] arr,int s){
// int min=s;
//     for(int i=s+1;i<arr.length;i++){
//         if(arr[i]<arr[min]){
//             min=i;
//         }
// }return min;
// }

// public static int min(int[] arr,int i,int j){
// int min=arr[0];
//     for(int m=0;m<arr.length;m++){
//         if(arr[i]<arr[min]){
//             min=i;
//         }
// }return min;
// }
//MAX

// public static int max(int[] arr){
//     int max=arr[0];
//     for(int i=1;i<arr.length;i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }
//     }return max;
// }


//SWAP
//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }



//  //COLLECTIVE SORTING
//    public static void main(String[] args) {
//     int[] arr={3,5,2,4,6};
// sort(arr);
// for(int x=0;x<arr.length;x++){
//     System.out.println(arr[x]+ " ");
// }
// }

// public static void sort(int[] arr){
//     for(int i=1;i<arr.length;i++){
//         int picked=arr[i];
//         int j=i-1;
//         while(j>=0 && arr[j]>picked){
//          arr[j+1]=arr[j];
//         // swap(arr, j,j-1);
//         j--;
//         }
//         arr[j+1]=picked;

//     }
//     }



//trap quess 42.  leetcode

// public static void main(String[] args) {
//     int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
// System.out.println(Water_Trapping(arr));
// }
// public static int Water_Trapping (int[] arr){
    
//       int n= arr.length;
//       int [] left=new int[n];
//       left[0]=arr[0];
//       for(int i=1;i<n;i++){
//         left[i]=Math.max(left[i-1],arr[i]);
//       }
// int [] right=new int[n];
//       right[n-1]=arr[n-1];
//       for(int i=n-2;i>=0;i--){
//          right[i]=Math.max(right[i+1],arr[i]);
//       }
// int sum=0;
// for (int i=0;i<n;i++){
//     sum=sum+Math.min(left[i],right[i])-arr[i];
// }
// return sum;
// }

// public static void main(String[] args) {
//     int[] arr={1,2,3,4};
// product(arr);
// }
// public static void product (int[] arr){
    
//       int n= arr.length;
//       int [] left=new int[n];
//       left[0]=1;
//       for(int i=1;i<n;i++){
//         left[i]=left[i-1]*arr[i-1];
//       }
// int [] right=new int[n];
//       right[n-1]=1;
//       for(int i=n-2;i>=0;i--){
//          right[i]=right[i+1]*arr[i+1];
//       }

// for (int i=0;i<n;i++){
//     int prod=left[i]*right[i];
//     System.out.print(prod + " ");
// }

// }





// public static void main(String[] args) {
//     int[] arr={2,3,5,7,8,9,11,13,15,18};
// int item=9;
// System.out.println(binary(arr,item));
// }
// public static int binary (int[] arr,int item){
//     int lo=0;
//     int hi=arr.length;
//     while(lo<=hi){
//         int mid=(lo+hi)/2;
//         if(arr[mid]==item){
//             return mid;
//         }else if(arr[mid]>item){
//             hi=mid-1;
//         }else{
//             lo=mid+1;
//         }
//     }
//      return -1;

// }




// public static void main(String[] args) {
//     int n=87;
//     int k=3;
// System.out.println(kthroot(n,k));
// }
// public static int kthroot(int n,int k){
//     int lo=1;
//     int hi=n;
//     int ans=0;
//     while(lo<=hi){
//         int mid=(lo+hi)/2;
//         if(Math.pow(mid,k)<=n){
//             ans=mid;
//             lo=mid+1;
//         }else{
//             hi=mid-1;
//         }
//     }
//      return ans;

// }


//https://leetcode.com/problems/first-bad-version
// public static void main(String[] args) {
//     int n=100;
// System.out.println(firstBadVersion(n));
// }

    // public int firstBadVersion(int n) {
    //     int lo=1;
    // int hi=n;
    // int ans=0;
    // while(lo<=hi){
    //     int mid=lo+(hi-lo)/2;
    //     if(isBadVersion(mid)==true){
    //         ans=mid;
    //         hi=mid-1;
    //     }else{
    //         lo=mid+1;
    //     }
    // }
    //  return ans;
    // }


public static void main(String[] args) {
    int[] arr={2,-3,5,-1,5};
    System.out.println(Maxsum(arr));
}
    // public static int Maxsum(int[] arr) {
    //     int ans=Integer.MIN_VALUE;

    //     for(int i=0;i<arr.length;i++){
    //        int sum=0;
    //      for(int j=i;j<arr.length;j++){
    //         sum=sum+arr[j];
    //         ans=Math.max(sum,ans);
    //      }
    //     }
    //  return ans;


    // public static int Maxsum(int[] arr) {
    //     int ans=Integer.MIN_VALUE;
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum=sum+arr[i];
    //         ans=Math.max(sum,ans);
    //         if(sum<0){
    //             sum=0;
    //         }
    //     }
    //  return ans;
    // }

    public static int Maxsum(int[] arr) {
      int[] ans = new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        ans=new ;
            ans[i] = sum;

    }
      return sum;
     }
   
}




