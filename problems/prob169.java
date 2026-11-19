package problems;

import java.util.Arrays;

public class prob169 {
    public static void main(String[] args) {
        int[] nums={3,2,3,3,5};
    System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length/2];
    }
}
