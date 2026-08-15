package problems;

public class prob125 {
    public static void main(String[] args) {
        String s1="a.";
        System.out.println(valpal(s1));
    }
    public static boolean valpal(String s1) {
        String s2=s1.toLowerCase();
         s2=s1.replaceAll(("[^a-zA-Z0-9]"), "");
        String rev="";

        for(int i=s2.length()-1;i>=0;i--){
         rev+=s2.charAt(i);
        }
        if(rev.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}
