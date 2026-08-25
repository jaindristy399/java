package problems;

import java.util.ArrayList;
import java.util.Collections;

public class prob66 {
    public static void main(String[] args) {
        int[] digits={9,9,9,9};
        System.out.println(plusone(digits));
    }
    public static int[] plusone(int [] digits) {
        ArrayList<Integer>ll=new ArrayList<>();
        int i=digits.length-1;
            int carry=0;
            digits[digits.length-1]+=1;
            while(i>=0){
                 //System.out.println(i);
                int sum=digits[i]+carry;
                if(sum>9){
                    ll.add(sum%10);
                    carry=sum/10;
                }else{
                    ll.add(sum);
                    carry = 0;
                    
                }i--;
            }
            if(carry!=0){
            ll.add(carry);
             }  Collections.reverse(ll);
             int[] ans = new int[ll.size()];
             for(int k=0;k<ll.size();k++){
                ans[k]=ll.get(k);
             }return ans;
} 
     }      

   



    

