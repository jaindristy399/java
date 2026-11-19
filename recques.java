// public class recques {
//    static void print(int n){
//      if(n==0){
//         return;
//      }
//      print(n-1);
//      System.out.println(n);
//    }
//    public static void main(String[] args) {
//     print(5);
//    }
// }

// public class recques {
//    static void print(int n){
//      if(n==0){
//         return;
//      }
//      System.out.println(n);
//      print(n-1);
     
//    }
//    public static void main(String[] args) {
//     print(5);
//    }
// }


// public class recques {
//     int sum=0;
//    void print(int n){
    
//      if(n==0){
//         System.out.println(sum);
//         return;
//      }
//      sum=sum+n;
//      print(n-1);
//      p
//    }
//    public static void main(String[] args) {
//     recques a=new recques();
//     a.print(5);
//    }
// }

public class recques {
    int sum=0;
   void print(int n){
    
    
     if(n==0){
        System.out.println(sum);
        return;
     }
     int rem=n%10;
     sum=sum+rem;
     n=n/10;
     print(n-1);
   }
   public static void main(String[] args) {
    recques a=new recques();
    a.print(1234);
   }
}