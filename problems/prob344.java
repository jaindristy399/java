package problems;

public class prob344 {
    public static void main(String[] args) {
        char [] s={'h','e','l','l','o'};
        reverse(s);

    }
    public static void reverse(char[] s){
      int i=0;
      int j=s.length-1;
      while(i<j){
        char temp=s[i];
       s[i]=s[j];
       s[j]=temp;
       i++;
       j--;
      }
      for(int k=0;k<s.length;k++){
        System.out.println(s[k]);
      }
    }
}
