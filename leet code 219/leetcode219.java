import java.util.*;

public class leetcode219 {
    //Function Definition
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i]) <= k){
                    return true;
                }
                else{
                    map.put(nums[i], i);
                }
            }
            else{
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1}; 
        int k = 3;

        //Function calling
        boolean ans = containsNearbyDuplicate(nums, k);
        System.out.println(ans);
    }
    
}
