package problems;

import java.util.Arrays;

public class prob26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 5, 5, 5};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
