// package problems;
// public class probe724 {
//     public static void main(String[] args) {
//         int nums[] ={1,7,3,6,5,6};
//       System.out.println(pivot(nums));
//     }
//     public static int pivot(int[] nums){
//      int Index=0;
//       int leftSum=0;
//       int rightSum=0;
//       int i=0;
//      for( i=0;i<nums.length;i++){
//         if(i==0){
//             leftSum=0;
//         }else{
//         leftSum=leftSum+nums[i-1];}
//         for(int j=i+1;j<nums.length;j++){
//             rightSum=rightSum+nums[j];
//         }
// if(leftSum==rightSum){
//             Index=i;
//             break;
//         }else{
//             Index=-1;
//         }
//         rightSum=0;
     
    
//     }
//     return Index;
//     }
// }





package problems;
public class probe724 {
    public static void main(String[] args) {
        int nums[] ={1,7,3,6,5,6};
      System.out.println(pivot(nums));
    }
    public static int pivot(int[] nums){
     int Index=0;
      int leftSum=0;
      int totalSum=0;
      
      int i=0;
      for(i=0;i<nums.length;i++){
        totalSum=totalSum+nums[i];
    }
     for( i=0;i<nums.length;i++){
       int rightSum=totalSum-leftSum-nums[i];

    if(leftSum==rightSum){
            Index=i;
            break;
        }else{
            Index=-1;
        }
        leftSum=leftSum+nums[i];
    }
    return Index;
    }
}





