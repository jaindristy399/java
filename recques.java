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


public class recques {
   static void print(int n){
    int sum=0;
     if(n==0){
        return;
     }
     sum=sum+n;
     print(n-1);
     System.out.println(sum);
   }
   public static void main(String[] args) {
    print(5);
   }
}