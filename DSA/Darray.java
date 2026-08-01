// import java.util.Scanner;


public class Darray {
//     public static void main(String[] args) {
//         int [][] arr =new int[3][4];
//         System.out.println(arr[1][2]);
//         Display(arr);
//     }
//     public static void Display(int[][] arr){
// for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int r=sc.nextInt();
//     int c=sc.nextInt();
//     int [][] arr=new int[r][c];

//     for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         Display(arr);
// }
// public static void Display(int[][] arr){
// for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }

// public static void main(String[] args){
    
//     int[][] arr={{1,2,3,4},{5,6,7,8},{4,5,6,7},{8,9,10,11}};
//         Display(arr);
// }
// public static void Display(int[][] arr){
// for (int col=0;col<arr[0].length;col++){

//     if(col%2==0){
//         for(int row=0;row<arr.length;row++){
//             System.out.print(arr[row][col]+" ");
//         }
//     }else{
//         for(int row=arr.length-1;row>=0;row--){
//             System.out.print(arr[row][col]+" ");
//         }
//     }
//         }

//     }



//. TRANSPOSE
// public static void main(String[] args){
    
//     int[][] arr={{1,2,3,4},{5,6,7,8},{4,5,6,7},{8,9,10,11}};
//         Transpose(arr);
// }
// public static void Transpose(int[][] arr){
// for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//                 // System.out.print(arr[j][i]+ " ");
//             }
//             System.out.println();
//         }
//     }





// public static void main(String[] args){
    
//     int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//     int target=3;
//         System.out.println((search(arr,target)));
// }
// public static boolean search(int[][] arr,int target){
// for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//             if(arr[i][j]==target){
//                 return true;
//                }
            
//         }
//     }
//         return false;
// }




// public static void main(String[] args){
    
//     int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//     int target=3;
//         System.out.println((search(arr,target)));
// }
// public static boolean search(int[][] arr,int target){
//     int i=0;
//     int j=arr[0].length-1
//     ;
// while( i<arr.length-1 &&  j>=0){
//             if(arr[i][j]==target){
//                 return true;
//                }
//                else if(arr[i][j]>target){
//                j--;
//                }else{
//                 i++;
//                }
            
//     }
//         return false;
// }


public static void main(String[] args){
    
    int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
    spiral(arr);
}
public static void spiral(int[][] arr){
    int minr=0;
    int maxr=arr.length-1;
    int minc=0;
    int maxc=arr[0].length-1;
    int totalel=arr.length*arr[0].length;
    int count=0;
    while(count<totalel){
    for (int i=minc;i<=maxc && count<totalel;i++){
        System.out.println(arr[minr][i]+" ");
        count++;
    }
    minr++;
    for(int i=minr;i<=maxr && count<totalel;i++){
        System.out.println(arr[i][maxc]+" ");
        count++;
    }maxc--;
    for(int i=maxc;i>=maxr && count<totalel;i--){
        System.out.println(arr[maxr][i]+" ");
        count++;
    }maxr--;
    for(int i=maxr;i>=minr && count<totalel;i--){
        System.out.println(arr[i][minc]+" ");
        count++;
    }minc++;
}}
    }
    



    