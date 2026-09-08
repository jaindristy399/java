package problems;

public class prob1512 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length;i++){
        for(int j=nums.length-1;j>0;j--){
          if(nums[i]==nums[j] && i<j){
           count++;
        }
        
        }
        
    }
    return count;
    }
}
