package problems;

import java.util.Arrays;

public class prob455 {
    public static void main(String[] args) {
        int[] g={10,9,8,7};
        int[] s={5,6,7,8};
        System.out.println(cookie(g, s));
    }
    public static int cookie(int[] g,int[] s){
//         Arrays.sort(g);
// Arrays.sort(s);
//         int count=0;
//         boolean[] used = new boolean[s.length];
//       for(int i=0;i<g.length;i++){
//         for(int j=0;j<s.length;j++){
//         if(s[j] >= g[i]){
//          count++;
//          used[j] = true;
//             break;
//         }
//       }}
//       return count;

 Arrays.sort(g);
 Arrays.sort(s);
 int i=0;
 int j=0;
 int count=0;
 while(i<g.length && j<s.length){
 if(s[j] >= g[i]){
    count++;
                i++;
                j++;
 }else{
    j++;
 }
 }
return count;
    }
}
