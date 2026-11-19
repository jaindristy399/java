package problems;

public class prob896 {
    public static void main(String[] args) {
        int nums[]={2,2,2,1,4,5};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int nums[]){
      int i=0;
      int j=1;
      boolean checkA=false;
      boolean checkB=false;
      while(j<nums.length){
        if(!checkA && !checkB){
            if(nums[i]<nums[j]){
              checkA=true;
            }else if(nums[i]>nums[j]){
            checkB=true;
        }
        }
        else{
            if(checkA){
        if(!(nums[i]<=nums[j])){
          return false;
        }}
        else if(checkB){
            if(! (nums[i]>=nums[j])){
              return false;
            }
        }
    }
        i++;
        j++;
      }
      
    return true;
    
    }
}
