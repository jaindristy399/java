public class L26Recursion {
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



//32
    // public static void main(String [] args){
    //  int x=2;
    //  int n=5;
    //  System.out.println(pow(x,n));
    // }
    // public static int pow(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //  int ans=pow(x,n-1);
    //  return ans*x;
    // }


// 5
// 4
// 3
// 2
// 1


    // public static void main(String [] args){
    //  int n=5;
    //  PD(n);
    // }
    // public static void PD(int n){
    //     if(n==0){
    //         return;
    //     }
    //  System.out.println(n);
    //    PD(n-1);
    // }



// 1
// 2
// 3
// 4
// 5
    // public static void main(String [] args){
    //  int n=1;
    //  PD(n);
    // }
    // public static void PD(int n){
    //     if(n==6){
    //         return;
    //     }
    //  System.out.println(n);
    //    PD(n+1);
    // }



    public static void main(String [] args){
     int n=5;
     PD(n);
    }
    public static void PD(int n){
        if(n==0){
            return;
        }
     System.out.println(n);
       PD(n-1);
    }
}
