package problems;
public class prob13 {
    public static void main(String[] args) {
        String s="CDIV";
        System.out.println(roman(s));
    }
    public static int roman(String s){
     int a=0;
        for (int i = 0; i < s.length()-1; i++) { 
            int current=value(s.charAt(i));
            int next=value(s.charAt(i+1));
        if(current<next){
            a=a-current;
        }else{
              a=current+a;   
         }      
        }a=a+value(s.charAt(s.length()-1));
        return a;
    }
    public static int value(char ch){
switch (ch ) {
    case 'I':
        return 1;
    case 'V':
        return 5;
    case 'X':
        return 10;
    case 'L':
        return 50;
    case 'C':
        return 100;
    case 'D':
        return 500;
    case 'M':
        return 1000;
        default:
            return 0;
    }
    }
    
}
