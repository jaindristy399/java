package problems;
public class prob3110 {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
       
        int j=1;
        int ch2=0;
        for(int i=0;i<s.length()-1;i++){
char ch = s.charAt(i);
char ch1 = s.charAt(j);
ch2=Math.abs(ch-ch1)+ch2;
j++;
        }
        return ch2;
    }
}
