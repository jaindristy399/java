package problems;

public class prob1108 {
    public static void main(String[] args) {
        String s1="1.1.1.1";
        defang(s1);
    }
    public static String defang(String s1){
       String s2=s1.replace(".", "[.]");
       return s2;
    }
}
