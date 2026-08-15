package problems;

public class prob121 {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        sellstock(arr);
    }
    public static int sellstock(int[] arr){
        int minm=arr[0];
        int maxpro=0;
      for(int i=0;i<arr.length;i++){
        minm=Math.min(minm,arr[i]);
        int profit=arr[i]-minm;
        maxpro=Math.max(maxpro,profit);
      }return maxpro;
    }
}
