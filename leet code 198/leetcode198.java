import java.util.*;

public class leetcode198 {
    // Method 1: using recursion
    // public int helper(int[] arr, int idx){
    //     // if we reach at the last element then we have only one choice, include the element in final ans
    //     if(idx==arr.length-1) return arr[idx];

    //     // if idx==arr.length return 0-->exclude the element
    //     if(idx>arr.length-1) return 0;

    //     // for every element we have two choices
    //     // 1. include the element and go to (idx+2)th element
    //     int include = arr[idx] + helper(arr, idx+2);
    //     // 2. dont include the element and move to next element i.e idx+1
    //     int dont_include = helper(arr, idx+1);

    //     // return the maximum value
    //     return Math.max(include, dont_include);
    // }

    // method 2: using dp
    public int helper(int[] arr, int idx, int[] dp){
        // if we reach at the last element then we have only one choice, include the element in final ans
        if(idx==arr.length-1) return arr[idx];

        // if idx==arr.length return 0-->exclude the element
        if(idx>arr.length-1) return 0;

        // we the choice of element is already computed then directly return it
        if(dp[idx] != -1) return dp[idx];

        // for every element we have two choices
        // 1. include the element and go to (idx+2)th element
        int include = arr[idx] + helper(arr, idx+2, dp);
        // 2. dont include the element and move to next element i.e idx+1
        int dont_include = helper(arr, idx+1, dp);

        // return the maximum value
        return dp[idx] = Math.max(include, dont_include);
    }

    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
}
