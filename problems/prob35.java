package problems;

public class prob35 {
    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        int target=7;
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
        if (lo < nums.length) {
    return lo;
}else{
    return hi+1;
}
        
    }
}
