//decimal to binary

// public class Main {
//     public static void main(String[] args) {
//         int n=37;
//         int sum=0;
//         int mul=1;
//         while(n>0){
//             int rem=n%2;
//             sum=sum+rem*mul;
//             mul=mul*10;
//             n=n/2;
//         }
//         System.out.println(sum);
//     }
// }

//binary to decimal

// public class Main {
//     public static void main(String[] args) {
//         int n=11011;
//         int sum=0;
//         int mul=1;
//         while(n>0){
//             int rem=n%10;
//             sum=sum+rem*mul;
//             mul=mul*2;
//             n=n/10;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
        
        // int n=398;
        // int sum=0;
        // int mul=1;

        // while(n>0){
        //     int rem=n%8;
        //     sum=sum+rem*mul;
        //     mul=mul*10;
        //     n=n/8;
        // }
        // System.out.println(sum);

//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in); 
// int n=scanner.nextInt();
// int r=0;
// while(n!=0){
// int d=n%10;
// r=r*10+d;
// n=n/10;}
// System.out.println(r);
// while(r!=0){
//     int d=r%10;
//     if(d==1){
//   System.out.println("5");  
// }else if(d==2){
//       System.out.println("4");  
// }else if(d==3){
//       System.out.println("3");  
// }else if(d==4){
//       System.out.println("2");  
// }else if(d==5){
//       System.out.println("1");  
// }else {
//       System.out.println("0");  
// }
// r=r/10;
// }





        // Scanner scanner = new Scanner(System.in); 
        // int minf = scanner.nextInt(); 
        // int maxf = scanner.nextInt(); 
        // int steps = scanner.nextInt(); 
        
        // // 1. Fixed the loop condition from "<-" to "<="
        // for (int i = minf; i <= maxf; i += steps) {
        //     // 2. Fixed formula: (i - 32) must be grouped together
        //     int c = (int) ((5.0 / 9) * (i - 32));
        //     System.out.println(i + "\t" + c); // Optional: prints both F and C side-by-side
        // }



//         scanner.close();
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         // int r = 0;
//         // while (n != 0) {
//         //     int d = n % 10;
//         //     r = r * 10 + d;
//         //     n = n / 10;
//         // }
//         int a1 = 0;
//         while (r != 0) {
//             int d = r % 10;
//             int x=0;
//             if (d == 5)
//             x=1;
//             else if (d == 4)
//             x=2;
//             else if (d == 3)
//              x=3;
//             else if (d == 2)
//             x=4;
//             else if (d == 1)
//             x=5;
//              a1=a1*10+x;
//             r = r / 10;
//         }
//         // int a2=0;
//         // while(a1!=0){
//         //   int d=a1%10;
//         //   a2=a2*10+d;
//         //   a1=a1/10;
//         // }
//         System.out.println(a1);
//     }
// }
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int r = scanner.nextInt();
//         int a1 = 0;
//         while (r != 0) {
//             int d = r % 10;
//             int x=0;
//             if (d == 5)
//             x=1;
//             else if (d == 4)
//             x=2;
//             else if (d == 3)
//              x=3;
//             else if (d == 2)
//             x=4;
//             else if (d == 1)
//             x=5;
//              a1=a1*10+x;
//             r = r / 10;
//         }
      
//         System.out.println(a1);
//     }
// }
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n= scanner.nextInt();
//         int sum = 0;
//         int pos=1;
//         while (n != 0) {
//             int rem = n % 10;
//         sum=(int) (sum+pos*Math.pow(10,rem-1));
//              pos++;
//              n=n/10;
//         }
      
//         System.out.println(sum);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         int a=9;
//         int b=17;
//         Add();
//          int c=a+b;
//         System.out.println(c);
//     }
// public static void Add(){
//     int a=19;
//         int b=17;
//         int c=a+b;
//         Sub();
//         System.out.println(c);
// }
// public static void Sub(){
//     int a=11;
//         int b=17;
//         int c=a-b;
//         System.out.println(c);
// }
// public static void main(String[] args) {
//         int a=9;
//         int b=17;
//         Add(a,b);
//     }
// public static void Add(int a,int b){
//         int c=a+b;
//         System.out.println(c);
// }
// public static void main(String[] args) {
//         int a=9;
//         int b=7;
//         int ans=Add(a,b);
//         System.out.println(ans);
//     }
// public static int Add(int a,int b){
//         int c=a+b;
//         System.out.println(sub(c,a));
//         return c;
// }
// public static int sub(int a,int b){
//         return a-b;
// }
// import java.util.Scanner;
// public class Main {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    int count=0,sum=0;
//    int r=0;
//    int no=n;
//         while(no>0){
//           int d=no%10;
//           r=r*10+d;
//           no=no/10;
//           count++;
//         }
//         System.out.println(count);
//         while(n>0){
//           int d=n%10;
//           sum=(int) (sum+Math.pow(d,count));
//           n=n/10;
//         }
//          System.out.println(sum);

//          if(n==sum){
//             System.out.println("yes it is an armstrong number");
//          }else{
//             System.out.println("no its not");
//          }
//     }

// }

import java.util.Scanner;
public class Main {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    System.out.println(count(n));
//    System.out.println(is_arm(n));
//     }
//     public static int count (int n) {
//         int count=0;
//         while(n>0){
//           count++;
//              n=n/10;
//         }
//         return count;
//     }

//     public static boolean is_arm(int n) {
//         int m=count(n);
//         int sum=0;
//         while(n>0){
//           int d=n%10;
//           sum=(int) (sum+Math.pow(d,m));
//           n=n/10;
//         }
//         if(sum==n){
//             return true;
//         }else{
//             return false;
//         }
//         }



// import java.util.Scanner;
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

//     Scanner sc=new Scanner (System.in);
//     int n=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
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

static int val=100;
public static void main(String[] args){
    System.out.println("hey");
    int x=60;
    System.out.println(val);
    fun(x);
    System.out.println(val);
}

public static void fun(int x){
    System.out.println(x);
    System.out.println(val);
    int val=17;
     val=19;
    System.out.println(val);
}
    }



