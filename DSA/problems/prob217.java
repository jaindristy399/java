package problems;
import java.util.Arrays;
public class prob217 {
    public static void main(String[] args) {
        int [] arr={2,3,4,9,7,8};
     System.out.println(duplicate(arr));
}
public  static boolean duplicate(int[] arr){
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]==arr[i+1]){
        return true;
      }
      }
    return false;
    }
}
