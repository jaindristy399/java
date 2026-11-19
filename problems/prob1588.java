package problems;
import java.util.Arrays;
public class prob1588 {
    public static void main(String[] args) {
        int []arr={1,4,2,5,3};
        oddlen(arr);
    }
    public static void oddlen(int[] arr){
        
      for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
          for(int k=i;k<=j;k++){
            int []n=new int[j];
                n[j]=arr[k];
                System.out.println(Arrays.toString(n));
          }
          System.out.println();
        }
      }
    }
}
