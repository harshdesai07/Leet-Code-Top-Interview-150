//Time Complexity : O((m+n)log(m+n))
//Space Complexity : O(1)
import java.util.*;

public class leetcode88 {
    //Function Definition
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++,i++) {
            nums1[i] = nums2[j]; 
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,0,3,3,3,0,0,0};
        int arr1[] = {1,2,2};
        int m = 6;
        int n = 3; 

        merge(arr, m, arr1, n);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    
}
