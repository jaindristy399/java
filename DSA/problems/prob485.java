package problems;

public class prob485 {
    public static void main(String[] args) {
        //int [] nums={1,1,0,1,1,1};
        //int [] nums={1,0,1,1,0,1};
        int [] nums={0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        //findMaxConsecutiveOnes(nums);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
//         int i=0;
//         int j=1;
//         int x=0;
//         int count=0;
//         while(j<nums.length){
//             if(nums[i]==1 && nums[j]==1){
//          count++;
//          x=count;
//             }else{
//                 count=0;
//             }i++;
//          j++;
//         }
//         if (x == 0) {
//     if (nums[0] == 1 || nums[nums.length - 1] == 1) {
//         return 1;
//     }
//     return 0;
// }
//         if(x>count){
//             return x+1;
//         }else{
//             return count+1;
//         }

int count=0;
int x=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
          if(count>x){
            x=count;
          }
        }
        else{
            count=0;
        }
    }
    return x;
        
    }

}
