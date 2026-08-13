package problems;
public class prob283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 0, 4, 5, 5, 5};
        int k = moveZeroes(nums);
        System.out.println(k);
        System.out.println(nums);
    }
    public static void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static int moveZeroes(int[] nums) {
        int j = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                swap(nums,i,j);
                j++;
            }   
        }
        return j ;
    }
}

