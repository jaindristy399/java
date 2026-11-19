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
    int sum=0;
   static void print(int n){
    recques a=new recques();
     if(n==0){
        return;
     }
     a.sum=a.sum+n;
     print(n-1);
     System.out.println(a.sum);
   }
   public static void main(String[] args) {
    a.print(5);
   }
}