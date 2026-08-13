public class L27Rec2 {
    // public static void main(String [] args){
    //  int n=5;
    //  System.out.println(fact(n));
    // }
    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //  int fn=fact(n-1);
    //  return fn*n;
    // }

    
    // public static void main(String[] args) {
    //     int n=5;
    //     System.out.println(fact(n,1));
    // }
    // public static int fact(int n,int ans){
    //     if(n==0){
            
    //     }
    //     return fact(n-1,ans*n);
    // }

    // public static void main(String [] args){
    //  int x=2;
    //  int n=5;
    //  System.out.println(pow(x,n,1));
    // }
    // public static int pow(int x,int n,int ans){
    //     if(n==0){
    //         return ans;
    //     }
    //  return pow(x,n-1,ans*x);
    // }

//search where item is there from start
    // public static void main(String[] args) {
    //     int[] arr={2,3,5,7,8,2,9};
    //     int item=5;
    //     int i=0;
    //     System.out.println(arraysearch(arr,i,item));
    // }
    // public static int arraysearch(int[] arr,int i,int item) {
    //     if(arr[i]==item){
    //         return i;
    //     }
    //    return arraysearch(arr,i+1,item);
    // }


//search where the item is there from last

    // public static void main(String[] args) {
    //     int[] arr={2,3,5,7,8,2,9};
    //     int item=2;
    //     int i=arr.length-1;
    //     System.out.println(arraysearch(arr,i,item));
    // }
    // public static int arraysearch(int[] arr,int i,int item) {
    //     if(i<0){
    //         return -1 ;
    //     }
    //     if(arr[i]==item){
    //         return i;
    //     }
    //     return arraysearch(arr,i-1,item);
    // }



    //search where where item is there 
    // public static void main(String[] args) {
    //     int[] arr={2,3,5,7,8,2,9};
    //     int item=2;
    //     int i=0;
    //     arraysearch(arr,i,item);
    // }
    // public static int arraysearch(int[] arr,int i,int item) {
    //     if(i>=arr.length){
    //         return -1 ;
    //     }
    //     if(arr[i]==item){
    //         System.out.println(i);
    //     }
    //     return arraysearch(arr,i+1,item);
    // }



public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n==0 || n==1){
            return n ;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        return f1+f2;
    }

}
