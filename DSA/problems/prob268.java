package problems;
import java.util.Arrays;

public class prob268 {
    public static void main(String[] args) {
        int[] nums={1,6,3,7,8,5};
        mis(nums);
    }
    public static void mis(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int maxm= nums.length;
        int minm=0;
        int i=minm;
        int j=0;
        while(i<(maxm-minm+1) && j<nums.length){
          if(i==nums[j]){
            j++;
          }else{
            System.out.println(i);
          }
          i++;
        }

    }
        
        }
        
    

