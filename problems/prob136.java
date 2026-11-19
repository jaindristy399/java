package problems;
public class prob136 {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    // public static int singleNumber(int [] nums){
    //     int [] count=new int[10];
    //     for(int i=0;i<nums.length;i++){
    //         count[nums[i]]++;
    //     }
    //     for(int j=0;j<nums.length;j++){
    //         if(count[nums[j]]==1){
    //           return nums[j];
    //         }
    //     }
    //     return -1;
    // }


    public static int singleNumber(int [] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans ^ nums[i];
        }
        return ans;
    }
}

