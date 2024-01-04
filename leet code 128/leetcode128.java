import java.util.*;

public class leetcode128 {
    //Function Definition
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxLen = 0;

        for(int n: nums){
            hs.add(n);
        }

        for(int num: hs){
            if(!hs.contains(num-1)) {
                //num is starting point of the sequence
                int currNum = num;
                //Length of current consecutive sequence
                int currLen = 1;

                while(hs.contains(currNum+1)){
                    currLen++;
                    currNum++;
                }

                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        //Function Calling
        int ans = longestConsecutive(nums);
        System.out.println(ans);
        
    }
}
