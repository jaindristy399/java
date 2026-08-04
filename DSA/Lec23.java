public class Lec23 {
    // public static void main(String[] args) {
    //     String s = "8 3 4 1 5";
    //     length(s);
    // }
    // public static void length(String s){
    //    for(int len=1;len<s.length();len++){
    //      for(int j=len;j<s.length();j++){
    //        int i=j-len;
    //        System.out.println(s.substring(i,j));
    //      }
    //    }
    // }



     public static void main(String[] args) {
  String s="81615";
  // System.out.println(10+30+s+20);
    System.out.println(length(s));

}
  public static int length(String s){
    int count=0;
    boolean[] visited =new boolean[s.length()];
       for(int len=1;len<s.length();len++){
         for(int j=len;j<s.length();j++){
           int i=j-len;
           String s1 =s.substring(i,j);
           long n=Long.parseLong(s1);
           if(isCB(n) == true && Isvalid(visited,i,j)==true){
            count++;
            for(int k=i;k<j;k++){
                visited[k]=true;
            }
           }
         }
       }
       return count;
}

private static boolean Isvalid(boolean[]visited,int i,int j){
for(i=0;i<j;i++){
if(visited[i]==true){
    return false;
}
}return true;
}

   public static boolean isCB(long num){
    if(num==0 || num==1){
        return false;
    }
    int[] arr={2,3,5,7,11,13,7,19,23,29};
    for(int i=0;i<arr.length;i++){
        if(num==arr[i]){
          return true;
        }
    }

    for(int i=0;i<arr.length;i++){
     if (num%arr[i]==0){
        return false;
     }
    }return true;

   }
}
