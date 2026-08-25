package problems;
public class prob1929 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,1};
        concat(nums1);
    }
    public static void concat(int[] nums1){
      int [] nums2=new int [nums1.length*2];
      //System.out.println(nums2.length);
      for(int i=0;i<nums1.length;i++){
        nums2[i]=nums1[i];
        nums2[nums1.length+i]=nums1[i];
      }
      for(int i=0;i<nums2.length;i++){
        System.out.println(nums2[i]);
      }
    }
}
