public class recques {
   static void print(int n){
     if(n==0){
        return;
     }
     
     System.out.println(n);
     printRev(n-1);
   }
   public static void main(String[] args) {
    print(1);
   }
}
