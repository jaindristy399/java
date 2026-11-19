package problems;
public class prob4 {
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2};
        prob4 a=new prob4();
        System.out.printf("%.4f",a.findMedianSortedArrays(nums1,nums2));
    }
 double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[] =concat(nums1,nums2);
        java.util.Arrays.sort(result);
        int x=result.length;
        if(x%2==1){
            return result[x/2];
        }
       else{
        return result[x/2]+result[x/2-1]/2.0;
       }
    }

    static int[] concat(int a[], int b[]) {
        int c[] = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        return c;
    }
}
