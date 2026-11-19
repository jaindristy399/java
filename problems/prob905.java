package problems;

import java.util.Arrays;

public class prob905 {
    public static void main(String[] args) {
        //int [] nums={3,1,2,4};
        int [] nums={0};
        
        evensort(nums);
    }
    public static void evensort(int[] nums){
     Arrays.sort(nums);
    //  System.out.println(Arrays.toString(nums));
     int i=0;
     int j=0;
     int temp=0;
     while(i<nums.length){
      if(nums[i]%2==0){
        temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        j++;
      }i++;
     }
     System.out.println(Arrays.toString(nums));
    }
}
