 public class Lec25slidingwindow {
//     public static void main(String[] args) {
//         int[] arr = {2,1,3,4,5,1,3,7,8,4,1};
//         int k=3;
//         System.out.println(Max_sum_of_size_k(arr,k));

//     }
//     public static int Max_sum_of_size_k(int[] arr,int k){
//         int sum=0;
//       for(int i=0;i<k;i++){
//         sum+=arr[i];
//       }
//       int ans=sum;
//       for(int i=k;i<arr.length;i++){
//         sum+=arr[i];
//         sum-=arr[i-k];
//         ans=Math.max(sum,ans);
//       }return ans;
//     }
    

// }



// public class Lec25slidingwindow {
//     public static void main(String[] args) {
//         int[] arr = {2,1,3,4};
//         System.out.println(Max_sum_of_size_k(arr));

//     }
//     public static int Max_sum_of_size_k(int[] arr){
//     int count=0;
//     for(int i=0;i<arr.length;i++){
//         int prod=0;
//         for(int j=i;j<arr.length;j++){
//          prod*=arr[j];
//          if(prod<k){
//             count++;
//          }
//         }
//     }
//     return count;
//     }
    

// }

// public class Lec25slidingwindow {
//     public static void main(String[] args) {
//         int[] arr = {2,1,3,4};
//         int k=100;
//         System.out.println(Max_sum_of_size_k(arr,k));

//     }
//     public static int Max_sum_of_size_k(int[] arr,int k){
//     int ei=0;
//     int si=0;
//     int ans=0;
//     int p=1;
//     while(ei<arr.length){
//         p*=arr[ei];
//         while(p>=k && si<=ei){
//         p=p/arr[si];
//         si++;
//         }
//         ans=ans+(ei-si+1);
//         ei++;
//     }
//     return ans;
//     }
    

// Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.
// Input format
// The first line contains an integer denoting the value of K.
// The next line contains a string having only 'a' and "b' as the characters.
// A single integer denoting the maximum perfectness achievable.
// Example 1
// Input
// 2
// abba
// Output
    public static void main(String[] args) {
        String str= "abababbbba";
        int k=2;
        int flip_a=Switchstring(str,'a',k);
        int flip_b=Switchstring(str,'b',k);
        System.out.println(Math.max(flip_a, flip_b));

    }

    public static int Switchstring(String str,char ch,int k){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while(ei<str.length()){
        //growing
        if(str.charAt(ei)==ch){
          flip++;
        }
        //shrinking
        while(flip>k && si<=ei){
        if(str.charAt(si)==ch){
            flip--;
        }
            si++;
        }
        
        //answer
        ans=Math.max(ei-si+1,ans);
        ei++;

}
       return ans;
    }
}