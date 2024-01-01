import java.util.*;
public class leetcode1 {
    public static void twoSum(int[] nums, int target) {
        int result[] = new int[2];

        // Using hashMap
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            m.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target && m.containsKey(0)){
                result[0] = i;
                result[1] = m.get(0);
                break;
            }
            else if(m.containsKey(target-nums[i])){
                if(m.get(target-nums[i]) > i){
                    result[0] = i;
                    result[1] = m.get(target-nums[i]);
                    break;
                }
            }
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15} ;
        int target = 9;

        twoSum(arr, target);
    }
    
}
