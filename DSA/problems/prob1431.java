package problems;

import java.util.ArrayList;
import java.util.List;

public class prob1431 {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max=0;
        int x=0;
     for(int i=0;i<candies.length;i++){
      max=Math.max(max, candies[i]);
     }
    for(int i=0;i<candies.length;i++){
     if(candies[i]+extraCandies>=max){
        ans.add(true);
     }else{
        ans.add(false);
     }
     }
     return ans;
    }
}
