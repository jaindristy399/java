package problems;

public class prob345 {
    public static void main(String[] args) {
        String s="IceCreAm";
        revvowel(s);
    }
//     public static String  revvowel(String s){
//       // String s1="aeiouAEIOU";
//       //   char [] b=s1.toCharArray();
//       char [] a=s.toCharArray();
//       int i=0;
//       int j=a.length-1;
//       while(i<j){
//       while(i<j){
//         if(s.charAt(i)=='a' || s.charAt(i)=='e'  || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'
//       || s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U'){
//        break;
//       }else{
//         i++;
//       }
//       }
//       while(i<j){
//         if(s.charAt(j)=='a' || s.charAt(j)=='e'  || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'
//       || s.charAt(j)=='A'|| s.charAt(j)=='E'|| s.charAt(j)=='I'|| s.charAt(j)=='O'|| s.charAt(j)=='U'){
//       break;
//       }else{
//        j--;
//       }
//       }
//       char temp=a[i];
//       a[i]=a[j];
//       a[j]=temp;
//        i++;
//        j--;
// }
//       return new String(a);
//     }
// }


public static boolean isVowel(char ch){
 return ch=='a' || ch=='e'  || ch=='i' || ch=='o' || ch=='u'
      || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U';
}

public static String  revvowel(String s){
      // String s1="aeiouAEIOU";
      //   char [] b=s1.toCharArray();
      char [] a=s.toCharArray();
      int i=0;
      int j=a.length-1;
      while(i<j){
      while(i<j && !isVowel(a[i])){
        i++;
      }
      while(i<j && !isVowel(a[j])){
        j--;
      }
      char temp=a[i];
      a[i]=a[j];
      a[j]=temp;
       i++;
       j--;
}
      return new String(a);
    }
}
