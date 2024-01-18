import java.util.*;
public class leetcode2251 {
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>(); // answer[0]
        List<Integer> secondList = new ArrayList<>(); // answer[1]

        // store the values of nums1 and nums2 in a set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i: nums1) set1.add(i);
        for(int i: nums2) set2.add(i);

        //  now check whether the element of set1 is present in set2
        for(Integer i: set1){
            if(!set2.contains(i)) firstList.add(i);
        }

        //  now check whether the element of set2 is present in set1
        for(Integer i: set2){
            if(!set1.contains(i)) secondList.add(i);
        }

        // now add both the list to final result
        al.add(firstList);
        al.add(secondList);

        return al;

        
    }
    
}
