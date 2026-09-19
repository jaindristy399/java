package problems;

public class prob1672 {
    public static void main(String[] args) {
        int arr[][]={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][]  accounts) {
      int []nums=new int[accounts.length];
      int max=0;
      for(int i=0;i<accounts.length;i++){
          int sum=0;
           for(int j=0;j<accounts[i].length;j++){
            sum=accounts[i][j]+sum;
           }
           nums[i]=sum;
      }
      for(int i=0;i<accounts.length;i++){
       max=Math.max(max, nums[i]);
      }
     return max;
      
    }
}
