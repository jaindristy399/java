package problems;

import java.math.BigInteger;

public class prob1822 {
    public static void main(String[] args) {
        int []arr={41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(prod(arr));
    }
     public static int prod(int[] nums){
int pos=0;
int neg=0;
// int y=0;
 for(int i=0;i<nums.length;i++){
       if(nums[i]>0){
        pos+=1;
       }else if(nums[i]==0){
         return 0;
       }else{
        neg+=1;
       }
     }
     if(neg%2==0){
        return 1;
     }
     return -1;
    }
}
//     BigInteger prod = new BigInteger("1");
    //  for(int i=0;i<nums.length;i++){
    //    prod=prod.multiply(BigInteger.valueOf(nums[i]));
    //  }
    //  if(prod.compareTo(BigInteger.ZERO)>0){
    //     return 1;
    //  }else if(prod.compareTo(BigInteger.ZERO)<0){
    //    return -1;
    //  }
    //  else{
    //     return 0;
    //  }