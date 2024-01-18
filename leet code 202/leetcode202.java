import java.util.*;

public class leetcode202 {
    public boolean isHappy(int n) {
        // when we encountered the same number again which is already be computed than we return false
        // to keep the track of computed number we use HashSet
        // if we got 1 we return true

        Set<Integer> computed = new HashSet<>();

        while(n!=1 && !computed.contains(n)){
            // add the number in set
            computed.add(n);

            int sum=0; //it wull store the sum of squares of a digit
            while(n>0){
                sum += Math.pow(n%10, 2.0);
                n/=10; 
            }

            // update the number
            n=sum;
        }

        return n==1;
    }
}
