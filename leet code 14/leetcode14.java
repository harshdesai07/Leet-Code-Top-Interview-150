import java.util.*;

public class leetcode14 {
    //Function Definition
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        //we choose the first string (at index 0) and the last string (at index strs.length - 1) after sorting because Sorting the strings brings similar prefixes together.
        //example---> If you have strings like ["apple", "app", "application"], after sorting, they will be ["app", "apple", "application"]. The longest common prefix is present between the first and last strings in this sorted order.
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        String[] arr = {"harsh","hdesai","het"};

        //Function calling
        String ans = longestCommonPrefix(arr);

        System.out.println(ans);
        
    }
    
}
