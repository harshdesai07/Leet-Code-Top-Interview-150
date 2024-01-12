

public class leetcode66 {
    public static int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length+1];

        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i] = digits[i] +1;
                return digits;
            }
               
            digits[i] = 0;
                
        }

        if(digits[0]==0){
            ans[0] = 1;
            return ans;
        }

        return digits;
        
    }

}
