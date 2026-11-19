// package notsolvedproblems;

// public class prob387 {
//     public static void main(String[] args) {
//         String s="aabb";
//         System.out.println(firstUniqChar(s));
//     }
//     public static int firstUniqChar(String s){
//         char[] arr = s.toCharArray();

//         for(int i=0;i<arr.length;i++){
//             int count=0;

//             for(int j=0;j<arr.length;j++){
//                 if(arr[i] == arr[j]){
//                    count++;
//                 }
//             }
//             if(count==1){
//                 return i;
//             }
//         }return -1;
       
//     }
// }






package problems;

public class prob387 {
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s){
       int [] count= new int[26];


        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
            for(int j=0;j<s.length();j++){
             if(count[s.charAt(j)-'a']==1){
                return j;
             }
        }return -1;
       
    }
}

