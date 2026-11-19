package notsolvedproblems;

import java.util.ArrayList;
import java.util.List;

public class prob118 {
    public static void main(String[] args) {
        int numRows=5;
        System.out.println(generate(numRows));
    }
    public  static List<Integer> generate(int numRows) {
        ArrayList<Integer> prev=new ArrayList<>();
     for(int i=0;i<numRows;i++){
        ArrayList<Integer> row = new ArrayList<>();
       for(int j=0;j<=i;j++){
        if(j==0 || j==i){
          row.add(1);
        }else{
            row.add(prev.get(j-1)+prev.get(j));
        }
       }

       if (i == numRows-1) {
            return row;
        }
       prev = row; 
     }
     return prev;
    }
}
