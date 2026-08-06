import java.util.*;
public class Lec24wrapclass {
    // public static void main(String[] args) {
    //     int a=10;
    //     Integer a1=10;
    //     //  Long l1=89l;
    //     //  long l2=67l;
    //     //  int b=89;
    //     //  Integer b1=145;
    //     //  b1=b;
    //     //  Float f=18.9f;
    //     //  Double d=17.8;

    // }

    // public static void main(String[] args){
    //     ArrayList<Integer> ll = new ArrayList<>();
    //     ArrayList<Integer> ll1 = new ArrayList<>();
    //     // ll.add(10);
    //     // ll.add(20);
    //     // ll.add(30);
    //     // ll.add(2,-6);
    //     ll.add(1);
    //     ll.add(2);
    //     ll.add(3);
    //     ll.add(4);
    //     ll1.add(7);
    //     ll1.add(2);
    //     ll1.add(3);
    //     ll1.add(5);
    //     ll1.add(7);
    //     ll1.add(9);
    //     System.out.println(ll);
    //     System.out.println(ll1);
    //     Collections.reverse(ll);
    //     Collections.reverse(ll1);

        
        
        // System.out.println(ll.size());
        //get
        // System.out.println(ll.get(2));
        // Collections.sort(ll);
        // Collections.reverse(ll);
        // ll.remove(1);
        // System.out.println(ll);
        // for(int i=0;i<ll.size();i++){
        //    System.out.println(ll.get(i)+" ");
        // }

        //foreachloop
        // for(int v: ll){
        //     System.out.println(v+" ");
        // }

        // char[] a={'a','b','c'};

        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i=0;i<Math.max(ll.size(),ll1.size());i++){
        //         int a;
        //         int b;
        //         if(i<ll.size()){
        //              a=ll.get(i);
        //         }else{
        //             a=0;
        //         }
        //         if(i<ll1.size()){
        //              b=ll1.get(i);
        //         }else{
        //             b=0;
        //         }
        //     ans.add(a+b);
        // }
        // Collections.reverse(ans);
        // System.out.println(ans);}


        public static void main(String[] args){
        int [] arr1={2,3,4,5};
        int [] arr2={7,3,4,5,8,9};
         
        }
        public static void AddNumber(int[] arr1,int[] arr2){
            ArrayList<Integer>ll=new ArrayList<>();
            int i=arr1.length-1;
            int j=arr2.length-1;
            int carry=0;
            while(i>=0 && j>=0){
             int sum= arr1[i]+arr2[j]+carry;
             ll.add(sum%10);
             carry=sum/10;
             i--;
             j--;
            }
            while(i>=0){
                int sum= arr1[i]+carry;
                ll.add(sum%10);
                carry=sum/10;
            }
            while(j>=0){
                int sum= arr1[j]+carry;
                ll.add(sum%10);
                carry=sum/10;
            }
            if(carry>0){
                ll.add(carry);
            }
            for(int k=ll.size()-1;k>=0;k--){
                System.out.println(ll.get(k)+" ");
            }

        }
    }

