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

// public class recques {
//     int sum=0;
//    void print(int n){
    
    
//      if(n==0){
//         System.out.println(sum);
//         return;
//      }
//      int rem=n%10;
//      sum=sum+rem;
//      n=n/10;
//      print(n);
//    }
//    public static void main(String[] args) {
//     recques a=new recques();
//     a.print(1234);
//    }
// }
// public class recques {
//     int prod=1;
//    void print(int n){
    
    
//      if(n==0){
//         System.out.println(prod);
//         return;
//      }
//      int rem=n%10;
//      prod=prod*rem;
//      n=n/10;
//      print(n);
//    }
//    public static void main(String[] args) {
//     recques a=new recques();
//     a.print(1234);
//    }
// }

public class recques {
    int prod=0;
    
   void print(int n){
    int next=n;
    System.out.println(n);
     if(n==0){
        System.out.println(prod);
        if(prod==next){
        System.out.println("pal");
     }else{
        System.out.println("non pal");
     }
        return;
     }
     
     int rem=n%10;
     prod=prod*10+rem;
     n=n/10;
     print(n);
     
   }

   public static void main(String[] args) {
    recques a=new recques();
    a.print(121);
   }
}