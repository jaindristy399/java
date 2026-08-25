package problems;

public class prob1295 {
    public static void main(String[] args) {
        int [] arr={555,901,482,1771};
        System.out.println(evendig(arr));
    }
    public static int evendig(int[] arr){
        int count=0;
      for(int i=0;i<arr.length;i++){
        String str=String.valueOf(arr[i]);
        int a=str.length();
        if(a%2==0){
            count++;
        }
      }return count;
    }
}
