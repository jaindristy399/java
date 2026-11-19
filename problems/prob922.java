package problems;

import java.util.Arrays;

public class prob922 {
    public static void main(String[] args) {
        int[] nums={2,3};
        sortArrayByParityII(nums);
    }
    public static int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0 && nums[i]%2!=0){
                while (nums[j] % 2 != 0) {
                j += 2;
            }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}
