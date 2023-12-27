import java.util.*;

public class Solution{
    //Function Definition
    public static int romanToInt(String s){
        Map <Character, Integer> hm = new HashMap<>();
        int ans =0;

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        for(int i=0; i<s.length()-1; i++){
            if(hm.get(s.charAt(i)) >= hm.get(s.charAt(i+1))){
                ans += hm.get(s.charAt(i));
            }
            else{
                ans -= hm.get(s.charAt(i));
            }
        }

        ans += hm.get(s.charAt(s.length()-1));


        return ans;
    }
    public static void main(String[] args) {
        int ans = romanToInt("MCMXCIV");
        System.out.println(ans);
        
    }
}