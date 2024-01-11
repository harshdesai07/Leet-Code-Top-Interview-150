import java.util.*;

public class leetcode228 {
    public static List<String> summaryRanges(int[] nums) {
        // List<String> l = new ArrayList<>();
        // int j=0, i=0;

        // while(i<nums.length-1){
        //     if(nums[i] != nums[i+1]-1){
        //         if(j<i || (j<i && i==nums.length-1)){
        //             l.add("" + nums[j] + "->" + nums[i]);
        //             j=i+1;
        //         }
        //         else{
        //         l.add(""+nums[i]);
        //         j++;
        //         }
        //     }
        //     i++;
        // }

        // if(i==nums.length-1 && j<i) l.add("" + nums[j] + "->" + nums[i]);
        // else l.add(""+nums[j]);

        // return l;

        // Method 2:
        int n = nums.length;
        List<String> result = new ArrayList<>();
  
        for (int i = 0; i < n; i++) {
          int num = nums[i];

          while (i<n-1 && nums[i]+1 == nums[i+1]) {
            i++;
          }
          
          if (num != nums[i]) result.add(num + "->" + nums[i]);
          else result.add(num + "");
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println(summaryRanges(arr));
    }
}
