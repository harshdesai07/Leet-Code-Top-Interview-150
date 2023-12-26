public class Main{
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val) 
            {
            nums[count] = nums[i];
            count+=1;
            }
        } 

        return count;     
    }
    public static void main(String[] args) {
        int val = 3;
        int arr[] = {1,3,56,3,3,5,0};

        System.out.println("The number of element is:"+removeElement(arr, val));
        
    }
}