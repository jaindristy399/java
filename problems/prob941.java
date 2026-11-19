package problems;

public class prob941 {
    public static void main(String[] args) {
        int arr[]={0,2,3,3,5,2,1,0};
        prob941 a=new prob941();
        System.out.println(a.moun(arr));
    }
     boolean moun(int[] arr){
        
        int i=0;
        while(i<arr.length-1 && arr[i]<arr[i+1]){
         i++;
        }
        if(i==0 || i==arr.length-1){
         return false;
        }
        while(i<arr.length-1 && arr[i]>arr[i+1]){
         i++;
        }
        return i==arr.length-1;
    }
}
