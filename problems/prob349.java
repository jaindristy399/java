package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class prob349 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
       intersection(nums1,nums2);
    }
    public static int[] intersection(int[] nums1,int[] nums2){
        ArrayList<Integer> ans=new ArrayList<>();
      for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j] && !ans.contains(nums1[i])){
                ans.add(nums1[i]);
                break;
            }
        }
      }
      int[] result = new int[ans.size()];
    for(int i = 0; i < ans.size(); i++) {
        result[i] = ans.get(i);
    }
    return result;
    }
}
