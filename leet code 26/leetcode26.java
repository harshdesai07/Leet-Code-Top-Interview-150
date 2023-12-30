

public class leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int j = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                count++;
                j++;
                nums[j] = nums[i];
                
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    
}
