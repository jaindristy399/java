package problems;
import java.util.Arrays;
public class prob242 {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        System.out.println(anagram(s1, s2));
    }
    public static boolean anagram(String s1,String s2){
       char[] a=s1.toCharArray();
       char[] b=s2.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       if(Arrays.equals(a,b)){
         return true;
       }
       return false;
    }
}
