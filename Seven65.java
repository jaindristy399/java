public class Seven65 {
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

public class Lec25slidingwindow {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        int k=100;
        System.out.println(Max_sum_of_size_k(arr,k));

    }
    public static int Max_sum_of_size_k(int[] arr,int k){
    int ei=0;
    int si=0;
    int ans=0;
    int p=1;
    while(ei<arr.length){
        p*=arr[ei];
        while(p>=k && si<=ei){
        p=p/arr[si];
        si++;
        }
        ans=ans+(ei-si+1);
        ei++;
    }
    return ans;
    }
    

}

}
