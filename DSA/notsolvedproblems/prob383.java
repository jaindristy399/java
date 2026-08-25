package notsolvedproblems;

public class prob383 {
    public static void main(String[] args) {
        String x="aa";
        String y="aab";
        canConstruct(x,y);
    }
    public static boolean canConstruct(String x, String y){
      char[] a = x.toCharArray();
    //  char[] b = x.toCharArray();

     
     for(int i=0;i<x.length();i++){
        boolean found =false;
        for(int j=0;j<y.length();j++){

        }
       if(x.charAt(j)== y.charAt(i)){
        j++;
       }
     } 

    }
}
