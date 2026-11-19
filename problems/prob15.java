// package problems;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// public class prob15{
//     public static void main(String[] args) {
//         int nums[] = {-1,0,1,2,-1,-4};
//         System.err.println(threeSum(nums));
//     }
//     public static List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> result = new ArrayList<>();
//         for (int fix = 0; fix < nums.length - 2; fix++) {
//         int left=fix+1;
//         int right=nums.length-1;
//         if (fix > 0 && nums[fix] == nums[fix - 1]) {
//         continue;
//           }
//         while(left<right ){
//         if(nums[fix]+nums[left]+nums[right]==0){
//         result.add(Arrays.asList(nums[fix], nums[left], nums[right]));
//             left++;
//             right--;
//         while(left< right && nums[left] == nums[left - 1]){
//           left++;
//         } 
//     while(left< right && nums[left] == nums[right+1]){
//           right--;
//         }
//     }
//         else if(nums[fix]+nums[left]+nums[right]>0){
//             right--;
//         }else if(nums[fix]+nums[left]+nums[right]<0){
//             left++;
//         }}}
//         return result;
//     }
// }