
public class leetcode167 {
    // Function Definition
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length; 
        int i=0, j=n-1;

        while(i<j){
            if(numbers[i] + numbers[j] > target) j--;
            else if(numbers[i] + numbers[j] < target) i++;
            else{
                ans[0]= i+1;
                ans[1] = j+1;
                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        int ans[] = twoSum(arr, target);

        for(int i=0; i<2; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
