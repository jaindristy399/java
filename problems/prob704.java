// package problems;

// public class prob704 {
//     public static void main(String[] args) {
//         int [] nums={-1,0,3,5,9,12};
//         int target=2;
//         System.out.println(search(nums,target));
//     }
//     public static int search(int[] nums, int target) {
//         int i=0;
//         while(i<nums.length){
//             if(nums[i]==target){
//                 return i;
//             }i++;
//         }return -1;
//     }
// }


package problems;

public class prob704 {
    public static void main(String[] args) {
        int [] nums={5};
        int target=5;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
         int mid=(lo+hi)/2;
         if(nums[mid]==target){
           return mid;
         }else if(nums[mid]<target){
           lo = mid + 1;
         }else{
            hi=mid-1;
         }
        }
        return -1;
    }
}
