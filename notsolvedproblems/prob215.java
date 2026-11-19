package notsolvedproblems;
import java.util.*;
public class prob215 {
    public static void main(String[] args) {
        int nums[]={3,2,3,1,2,4,5,5,6};
        int k=4;
        prob215 a=new prob215();
        System.out.println(a.findKthLargest(nums,k));
    }
     int findKthLargest(int[] nums, int k) {
        int max = nums[0];
         int maxIndex = -1;
         
       for(int i=0;i<k;i++){
        max = Integer.MIN_VALUE;
        maxIndex = -1;
     for (int j = 0; j < nums.length; j++) {
       if(max<nums[j]){
        max=nums[j];
         maxIndex = j;
       }
     }
     if(maxIndex != -1){
      nums[maxIndex]=Integer.MIN_VALUE;
     }
       } 
       return max;
    }
}
