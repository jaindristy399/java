package problems;

import java.util.Arrays;

public class prob20 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};
        int m=3;
        int n=3;
        System.err.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }
    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
     for(int i=0;i<nums2.length;i++){
          nums1[m+i]=nums2[i];
     }
     Arrays.sort(nums1);
       return nums1;
    }
}
