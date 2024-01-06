public class leetcode80{
    public static int removeDuplicates(int[] nums) {
        int i = 0;  // This is like a marker that keeps track of where we'll put unique numbers.

        // Loop through each number in the list
        for (int n : nums) {
            // If we've seen fewer than two copies of this number or 
            // if this number is bigger than the one two places back,
            // it means it's a new or different number we should keep.
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;  // Add this new/unique number to the list
            }
        }
        // 'i' now tells us how many unique numbers are in the list.
        return i;  // Return the count of unique numbers.
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        int ans = removeDuplicates(nums);
        System.out.println(ans);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
